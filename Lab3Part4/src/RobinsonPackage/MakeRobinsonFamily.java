
package RobinsonPackage;

import Exception.FirstNameExistsException;
import Exception.SurnameMismatchException;

public class MakeRobinsonFamily {

	public static void main(String[] args) throws SurnameMismatchException,FirstNameExistsException {
		
		Person member1 = new Person("John","Robinson");
		Person member2 = new Person("Paul","Robinson");
		Person member3 = new Person("Peter","Robinson");
		Person member4 = new Person("Missy","Robinson");
		Person member6 = new Person("Jessy","James");
		Family robinsons = new Family("Robinson");
		
		try {
			robinsons.addFamilyMember(member1);
			robinsons.addFamilyMember(member2);
			robinsons.addFamilyMember(member3);
			robinsons.addFamilyMember(member4);
			robinsons.addFamilyMember(member6);
			
		}
		catch(FirstNameExistsException ex) {
			ex.printStackTrace();
		}
		
		catch(SurnameMismatchException ex){
			ex.printStackTrace();
		}
		
		String[] familyList = robinsons.getFamilyMembers();
		
		for(int i=0;i<familyList.length;i++) {
			System.out.println(familyList[i]);
		}

	}

}

