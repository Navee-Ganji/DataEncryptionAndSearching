package com.praka.config.Service1;

import org.springframework.stereotype.Component;

@Component
public class Service1 implements Service1Interface{
	
		public String encodeHNo(String h_no)
		{
			String address = h_no+"-0";
			String s = "";
			String main  = "";
			int count = 1;
			int zeroCount = 0;
			for (int i = 0; i < address.length(); i++)
			{
				char ch = address.charAt(i);
				if (Character.isAlphabetic(ch) || Character.isDigit(ch))
				{
					s = s + ch;
				}
				else
				{
					switch (count) {
					case 1:
						try
						{
							int n = Integer.parseInt(s) + 100;
							main = n +"";
							count++;
						}
						catch (Exception e)
						{
							main = main + "-" + s;
						}
						
						break;
					case 2 :
						try {
							int n1 = Integer.parseInt(s);
							String s2 = "0" + n1; 
							main = main + "-" + s2;
							count++;
						}
						catch (Exception e)
						{
							main = main + "-" + s;
						}
						
					break;
					default:
						try {
							int n6 = Integer.parseInt(s);
							int length = s.length() - 1;
							String s6 = length + s;
							main = main + "-" + s6;
							zeroCount++;
						} catch (Exception e) {
							main = main + "-" + s ;
						}
					}
					s = "";
					if (ch == ' ' || ch == ','|| ch == 'r'|| ch == 'R'|| ch == 't'|| ch == 'T')
					{
						break;
					}
				}
			}
			String zero = "";
			for (int i = 0; i < zeroCount + 2; i++) {
				zero = zero + "0";
			}
			main = main +" "+zero;
			return main;
		
		}
	}


