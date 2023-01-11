package chapter06;

public class TeamMemberMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		
		//메소드를 통해서 팀명을 초기화
		t.setTeamName("IT프렌즈");
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("---------[팀원 명단]-------------");
		team.init(); //초기화 
		team.Disp(); 
		t.setmName("김창우");
		System.out.println("팀장이름 : " + t.getmName());
		t.setMphone("010-1111-2222");
		System.out.println("팀장 번호 : " + t.getMphone());
		

	}

}
