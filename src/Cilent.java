
public class Cilent {
	public static void main(String[] args) {
		IUser iuser = new EmployeeUser();
		UserManager user = new UserManager(iuser);
		System.out.println(""+ user.getName());
	}
}