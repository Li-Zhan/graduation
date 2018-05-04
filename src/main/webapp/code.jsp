<%@ page language="java" import="java.util.*,java.awt.*" pageEncoding="UTF-8"%>
<%@ page import="javax.imageio.*"%>
<%@ page import="java.awt.image.*" %>
<!-- 验证码 -->
<html>
  <head>
    <title>验证码</title>
  </head>
  
  <body>
    <%
    response.setHeader("Cache-Control","no-cache");
    //内存中创建图像
    int width=60,height=20;
    BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    //获取画笔
    Graphics g=image.getGraphics();
    //设定背景色,并填充整个图像区(创建画布)
    g.setColor(new Color(200,200,200));
    g.fillRect(0,0,width,height);
    //随机数
    Random rnd=new Random();
    int randNum=rnd.nextInt(8999)+1000;
    String randStr=String.valueOf(randNum);
    //将验证码存入session
    session.setAttribute("randStr",randStr);
    //将验证码显示在画布
    g.setColor(Color.black);
    g.setFont(new Font("",Font.PLAIN,20));
    g.drawString(randStr,10,17);
    //生成100个干扰点（就是图片上的噪点）
    for(int i=0;i<100;i++){
      int x=rnd.nextInt(width);
      int y=rnd.nextInt(height);
      g.drawOval(x,y,1,1);
    }
    //输出图像
    ImageIO.write(image,"JPEG",response.getOutputStream());
    out.clear();
    out=pageContext.pushBody();
     %>
  </body>
</html>