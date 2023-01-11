package chapter06;

public class TeamMember {

	//멤버변수
	public String teamName; //팀명
	public String mName; //팀장
	public String mphone; //팀장전화번호
	public String sName; //부팀장
	public String name; //팀원
	public String gender; //팀원성별
	
	//기본 생성자 (이름이나 성별 말고 나머지 불러올 것을 생각해서!)
	public TeamMember() {}

	//오버로딩(생성자를 통해 초기화-값을 넣는다)
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
	
	}
	//메소드 통한 초기화
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}//class
