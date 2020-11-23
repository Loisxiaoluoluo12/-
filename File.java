package pac1;

import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class File {
	public static void main(String[] args){
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy 'M-dd");
//		sdf.setLenient(false);
//		String fileName=sdf.format(new Date())+"file.txt";
//		File file=new File("D:\\"+fileName);
//		if(file.exists()){
//		System.out.println("文件已经存在");
//		}else{
//		file.createNewFile();
//		System.out.println("创建新文件,件路径为:"+"D:\\"+fileName);
//		}
//		try{
//			FileWriter fw=new FileWriter(fileName);
//			fw.write("wenjian");
//			fw.flush();
//			fw.close();
//			System.out.println("写入成功");
//			
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		try {
			Scanner stu1=new Scanner(System.in);
			System.out.println("请输入名字：");
			   String name=stu1.next();
			   System.out.println("请输入学号：");
			   String number=stu1.next();
			   System.out.println("请输入性别：");
			   String sex=stu1.next();
			   System.out.println("123");
			   
			FileInputStream fis=new FileInputStream("C:\\Users\\13243\\Desktop\\B.txt");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\13243\\Desktop\\A.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            writer.write("学生基本信息："+name+"  "+ number +"   "+sex+"\n");
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

            reader.close();
            writer.close();

            fos.close();
            fis.close();
            FileInputStream input1=new FileInputStream("C:\\Users\\13243\\Desktop\\A.txt");
			  BufferedReader reader1=new BufferedReader(new InputStreamReader(input1));
				String s = reader1.readLine(); //读取行数
				System.out.println("请输入关键字：");
				Scanner sc=new Scanner(System.in);//从键盘接收数据
				String str=sc.nextLine();
				char[] ch=str.toCharArray();
				int count=0;
		        while (s != null) //确定行数不为空
				{            
					boolean b=s.contains(str);//子字符串是否被包含在此字符串之中,包含输出true，否则输出false
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

        } catch (IOException e) {
            System.out.print("Exception");
        }
	}

//	private static boolean createNewFile(String filepath) {
//		boolean file=false;
//		File newF=new File(filepath);
//		if(!newF.exists()){
//			try{
//			newF.createNewFile();
//			}
//		}
		// TODO Auto-generated method stub
		
}
