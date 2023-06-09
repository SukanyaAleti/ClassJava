abstract class Department{
    abstract int getDepartmentSize();
}
class CseDepartment extends Department{
     private int size;
     public CseDepartment(int size) {
          this.size = size;
    }
        public int getDepartmentSize() {
            return size;
        }
}
public class DepartmentTest {
    public static void main(String[] args) {
         CseDepartment d = new CseDepartment(10);
        int departmentSize = d.getDepartmentSize();
        System.out.println("Cse Department Size: " + departmentSize);
    }
}
