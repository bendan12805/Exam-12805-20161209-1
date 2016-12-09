package Qiulanqian.Exam_first;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list = new ArrayList<Integer>();
    				
			boolean b=false;
			String str ="";
			for(int i=101;i<=200;i++)
			{
				for(int j=2;j<100;j++)
				{
					if(i%j ==0)
					{
						b=true;
						break;
					}
				}
				if(b){
					b=false;
					continue;
					}
				list.add(i);
			}
	
			System.out.print("101-200 间总共有"+list.size()+"个素数 , 分别是 :");
			for(int i=0;i<list.size();i++){
				str+=","+list.get(i);
			}
			System.out.print(str.substring(1));
			
		}


    }

