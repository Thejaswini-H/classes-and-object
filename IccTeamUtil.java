class IccTeamUtil{
public static void main(String a[]){

IccTeams team= new IccTeams();
team.name="BCCI";
team.year=1926;
team.country="India";
System.out.println(team.name+" "+team.year+" "+team.country);
team.series();

IccTeams team1= new IccTeams();
team1.name="NZC";
team1.year=1926;
team1.country="New Zealand";
System.out.println(team1.name+" "+team1.year+" "+team1.country);
team1.series();

IccTeams team2= new IccTeams();
team2.name="CA";
team2.year=1905;
team2.country="Australia";
System.out.println(team2.name+" "+team2.year+" "+team2.country);
team2.series();
}
}
