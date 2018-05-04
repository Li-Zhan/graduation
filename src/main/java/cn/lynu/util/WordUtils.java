package cn.lynu.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class WordUtils {  
    //配置信息,代码本身写的还是很可读的,就不过多注解了  
    private static Configuration configuration = null;  
    //这里注意的是利用WordUtils的类加载器动态获得模板文件的位置  
    private static final String templateFolder =  WordUtils.class.getClassLoader().getResource("../").getPath()+"/templete/";  
    static {  
        configuration = new Configuration();  
        configuration.setDefaultEncoding("utf-8");  
        try {
            configuration.setDirectoryForTemplateLoading(new File(templateFolder));  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
   }  
  
    private WordUtils() {
        throw new AssertionError();  
    }  
  
    public static void exportMillCertificateWord(HttpServletRequest request, HttpServletResponse response,
    		Map map, String templeteName, String fileName) throws IOException {  
        //Template freemarkerTemplate = configuration.getTemplate("开题报告.ftl");  
        Template freemarkerTemplate = configuration.getTemplate(templeteName);  
        File file = null;  
        InputStream fin = null;  
        ServletOutputStream out = null;  
        try {  
            // 调用工具类的createDoc方法生成Word文档  
            file = createDoc(map,freemarkerTemplate);  
            fin = new FileInputStream(file);  
  
           // response.setCharacterEncoding("utf-8");  
            response.setContentType("application/msword;charset=utf-8");  
            // 设置浏览器以下载的方式处理该文件名  
           // String fileName = "开题报告.doc";  
            response.setHeader("Content-Disposition", "attachment;filename="  
                   // .concat(String.valueOf(URLEncoder.encode(fileName, "UTF-8"))));  
            		  .concat(String.valueOf(Utils.filenameEncoding(fileName, request))));  
  
            out = response.getOutputStream();  
            byte[] buffer = new byte[512];  // 缓冲区  
            int bytesToRead = -1;  
            // 通过循环将读入的Word文件的内容输出到浏览器中  
            while((bytesToRead = fin.read(buffer)) != -1) {  
                out.write(buffer, 0, bytesToRead);  
            }  
        } finally {  
            if(fin != null) fin.close();  
            if(out != null) out.close();  
            if(file != null) file.delete(); // 删除临时文件  
        }  
    }  
  
    private static File createDoc(Map<?, ?> dataMap, Template template) {  
        String name =  "test.doc";  
        File f = new File(name);  
        Template t = template;  
        try {  
            // 这个地方不能使用FileWriter因为需要指定编码类型否则生成的Word文档会因为有无法识别的编码而无法打开  
            Writer w = new OutputStreamWriter(new FileOutputStream(f), "utf-8");  
            t.process(dataMap, w);  
            w.close();  
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw new RuntimeException(ex);  
        }  
        return f;  
    }  
}  