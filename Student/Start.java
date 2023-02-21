package Student;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcom Student management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 ADD Student");
			System.out.println("Press 2  Delete Student Name");
			System.out.println("Press 3 Display Student");
			System.out.println("Press 4 Exit App");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add Student...
				System.out.println("Enter user Name :");
				String name=br.readLine();
				
				System.out.println("Enter user Phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user City :");
				String city=br.readLine();
				
				//create student object to store student..
				Student st=new Student(name,phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added successfully");
				}else
				{
					System.out.println("Somthing went Worng try Again...");
				}
				System.out.println(st);
				
				
			}else if(c==2) {
				//delete student..
				
				System.out.println("Enter student id");
				int userId = Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted.....");
				}
				else {
					System.out.println("Somthing is Wrong..Try again..");
				}
				
			}else if(c==3)
			{
				// Display Students..
				StudentDao.showAllStudent();
				
			}else if(c==4) {
				//Exit App
				break;
				
			}else
			{
				
			}
		}
		System.out.println("Thankyou for using Application...");
		System.out.println("See you Soon....bye bye");

	}

}
