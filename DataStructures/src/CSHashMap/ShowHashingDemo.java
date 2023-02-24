package CSHashMap;

public class ShowHashingDemo {

	public static void main(String[] args) {
		int sizeOf = 11;
        //No collisions:
//        String names[] = {"Mia", "Tim", "Bea", "Zoe", "Jan", "Ada", "Leo", "Sam", "Lou", "Max", "Ted"};        
//        
//        for (String name : names) {
//            getElement(name, sizeOf);
//        }
        
        CSLinkedList.SingleLinkedList<String> nameList = new CSLinkedList.SingleLinkedList<>();
        nameList.add("Mia");
        nameList.add("Tim");
        nameList.add("Bea");
        nameList.add("Zoe");
        nameList.add("Jan");
        nameList.add("Ada");
        nameList.add("Leo");
        nameList.add("Sam");
        nameList.add("Lou");
        nameList.add("Max");
        nameList.add("Ted");        
        for(int i = 0; i < nameList.size(); i++){            
            getElement(nameList.get(i), sizeOf);
        }
        
//        System.out.println("Let's introduce collisions: " );
//        CSLinkedList.SingleLinkedList<String> nameList2 = new CSLinkedList.SingleLinkedList<>();
//        nameList2.add("Tim");
//        nameList2.add("Bea");
//        nameList2.add("Zoe");
//        nameList2.add("Mia");
//        nameList2.add("Sue");
//        nameList2.add("Len");
//        nameList2.add("Moe");        
//        nameList2.add("Lou");
//        nameList2.add("Rae");
//        nameList2.add("Max");
//        nameList2.add("Tod");
//        for(int i = 0; i < nameList2.size(); i++){            
//            getElement(nameList2.get(i), sizeOf);
//        }
        
    }

    public static void getElement(String theString, int elements) {        
        int retVal = 0;
        theString.replaceAll("\\s", "");
        theString.replaceAll("[^a-zA-Z0-9]", "");
        char[] letters = theString.toCharArray();
        int sum = 0;
        System.out.printf("%s ", theString);
        for (char letter : letters) {
            System.out.printf("%s  %d ", letter, (int)letter);
            sum += (int)letter;
        }
        retVal = sum % elements;
        System.out.printf("= %d %% %d  element: %d\n", sum, elements, retVal);
                
    }

	}

