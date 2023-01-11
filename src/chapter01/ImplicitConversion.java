package chapter01;

public class ImplicitConversion {
 public static void main(String[] args) {
	 //臾듭떆�쟻 �삎蹂��솚 : �옉�� 硫붾え由ъ뿉�꽌 �겙 硫붾え由щ줈 �옄�뿰�뒪�읇寃� �삎蹂��솕
	 
	 byte bnum = 10; // 8byte
	 int iNum = bnum ; // 32鍮꾪듃
	 
	 System.out.println(bnum);
	 System.out.println(iNum);
	 
	 //臾듭떆�쟻 �삎蹂��솕 : �뜑 �젙諛��븳 �닔濡� �옄�뿰�뒪�뾽寃� �븫�떆�쟻 �삎蹂��솚
	 
	 iNum=30; // 紐낆떆留� �븯吏� �븡�쑝硫� 媛숈� 蹂��닔媛숈쓣 �궗�슜 媛��뒫 
	 
	 int iNum2 = 20;
	 float fNum = iNum2;
	 
	 System.out.println("=================");
	 System.out.println(iNum2);
	 System.out.println(fNum);
}
}