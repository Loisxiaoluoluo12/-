#java第五次实验
## 实验内容
1.project：String
2.Package:pac1   
3.Class:File

(1)File类
* File类实现了三个功能  
(1)通过Scanner类将学生的信息写如A.txt文件中。
(2)给定一段词，将词以十四个字一行的格式输出，并输入相关的标点符号，按要求进行换行。  
(3)输入关键字，查询该关键字在这段文字中出现的次数。  
## 实验目的
1.掌握字符串String及其方法的使用   
2.掌握文件的读取/写入方法   
3.掌握异常处理结构  

## 实验过程
1.分析题目的相关需求，设计学生类（可利用之前的），采用交互式方式实例化某学生；设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
2.根据上述需求分析，首先建立相关的类。  
3.根据项目的需求，完善类中的内容。   
4.调用类中的相关信息。  
5.运行程序，展示结果。  
## 核心方法
(1)采用交互式方式实例化某学生
```
Scanner stu=new Scanner(System.in);
```
(2)通过Scanner输入学生类的相关信息
```
System.out.println("请输入名字：");
String name=stu.next();
System.out.println("请输入学号：");
String number=stu.next();
System.out.println("请输入性别：");
String sex=stu.next();
```
(3)将输入的学生信息写入到文本文件中
```
writer.write("学生基本信息："+name+"  "+ number +"   "+sex+"\n");
```
(4)将文本文件的内容读入和写入
```
FileInputStream fis=new FileInputStream("C:\\Users\\13243\\Desktop\\B.txt");
FileOutputStream fos=new FileOutputStream("C:\\Users\\13243\\Desktop\\A.txt");
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
```
(5)通过判断给古诗词加入标点符号并进行换行
```
char[] buff = new char[7];
            int len = reader.read(buff);
            int index = 1;
            while (len != -1) {
                writer.write(buff,0,len);
                if (index %2 ==0){
                    writer.write("。\n");
                }else{
                    writer.write("，");
                }
                len = reader.read(buff);
                index ++;

            }
```
(4)随机输入关键字，筛查该关键字出现的次数
```
 while (s != null) 
				{            
					boolean b=s.contains(str);
					String[] st=new String[s.length()-ch.length+1];			
					if(b==true)
					{
						for(int i=0;i<st.length;i++)
						{
							st[i]= s.substring(i,i+ch.length);
							if(st[i].equals(str))
							{
								count++;
							}
						}
					}
					s = reader1.readLine(); 
		        } 
				System.out.println("包含  "+str+"   次数为："+count);//调用count，输出包含次数
```
## 实验结果
(1)运行结果1
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/ruAMsa53pVQWN7FLK88i5qaCSQ2V9xGUSPFmhkAUTnqfeANvGAnsblO8k*wT051tPWPrG5.P9A1*g84r9698x8Q5pnMHj1iRkOilCBBCub4!/b&bo=jQQlAQAAAAADB48!&rf=viewer_4)   
(2)运行结果2
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/45NBuzDIW489QBoVep5mce0Vsa1G1PElQMiICSdaBHXEIxkRArZtNnurCaC.QfB9RyRSHyKky3cqno2ZwnuUGsSVZcnSthv1PWF.x3T*F4I!/b&bo=8QGIAwAAAAADF0k!&rf=viewer_4) 
## 实验感想 
在该实验中，我掌握了Scanner的用法，知道了如何读入文件和将信息写入到文件中，熟悉了循环结构的使用。希望在以后的学习中能够了解到更多的编程信息。    
