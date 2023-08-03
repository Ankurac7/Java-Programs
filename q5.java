class College{
    String College_Name;
    String Address;
    void show_collegedetails(String College_Name, String Address){
        this.College_Name=College_Name;
        this.Address=Address;
        System.out.println(College_Name+" "+Address);
    }
}
class FacultyMembers{
    String Faculty_Name;
    String Faculty_Degree;
    int Experience;
    void facultyDetails(String Faculty_Name, String Faculty_Degree, int Experience){
        this.Faculty_Name=Faculty_Name;
        this.Faculty_Degree=Faculty_Degree;
        this.Experience=Experience;
        System.out.println(Faculty_Name+" "+Faculty_Degree+" "+Experience);
    }
}

class Department extends College{
    String Dept_name;
    String HOD_name;
    void show_departmentdetails(String Dept_name, String HOD_name){
        this.Dept_name=Dept_name;
        this.HOD_name=HOD_name;

        System.out.println(Dept_name+" "+HOD_name);
        super.show_collegedetails("IEM", "Sector V, Salt Lake");
    }
    public static void main(String s[])
    {
        FacultyMembers f=new FacultyMembers();
        f.facultyDetails("Teacher_name", "B.Tech", 3);
        Department o=new Department();
        o.show_departmentdetails("AIML","Amartya");
    }
}