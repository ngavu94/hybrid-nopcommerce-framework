package dynamicLocator;

import java.io.File;

public class SystemInformation {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println(osName);

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        String image01FilePath = projectPath + File.separator +"uploadFiles"+File.separator+"image01.jpg";
        System.out.println(image01FilePath);
    }
}
