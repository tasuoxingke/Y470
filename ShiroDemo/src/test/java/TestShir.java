import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class TestShir{

	public static void main(String[] args) {
		// 1.3.2版本的jar,高版本的jar包里面的IniSecurityManagerFactory方法被弃用了
		IniSecurityManagerFactory iniSecurityManagerFactory = new IniSecurityManagerFactory();
		SecurityManager instance = iniSecurityManagerFactory.getInstance();
		SecurityUtils.setSecurityManager(instance);
		Subject subject = SecurityUtils.getSubject();
	
		

		try {
			subject.login(new UsernamePasswordToken("lisi", "0123"));
			
			System.out.println("success...");
			subject.checkRole("admn");
			System.out.println("is a admin");
		/*	if (subject.hasRole("admin")) {
				System.out.println("has admin...");
			}
			if (subject.isPermitted("insert")) {
				System.out.println("can insert...");
			}*/
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("failed....");

		}
	}

}
