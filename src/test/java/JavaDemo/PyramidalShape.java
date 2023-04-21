package JavaDemo;



public class PyramidalShape {

	public static void main(String[] args) {
		
		int n=5;

        System.out.println("----Pattern is----");
 
        for (int i = 1; i<=n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            } 
 
            System.out.println(); 
        } 
 
        // lower half of the pattern 
 
        for (int i = n-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
            
            System.out.println("--- Pattern Is----");
        }
           
        
        for (int i = n; i >= 1; i--) 
            {
            for (int j = 1; j <= i; j++)
           {
              System.out.print(j+" ");
            }
 
           System.out.println();
       }
 
        for (int i = 2; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
        
        System.out.println("----Pattern is----");
        
        
        
        for (int i = 1; i <= n; i++) 
           {
 
 
            for (int j = 1; j < i; j++) 
            {
                System.out.print("");
            }
 
 
 
            for (int j = i; j <= n; j++) 
            { 
                System.out.print(j+" "); 
            } 
 
            System.out.println(); 
        } 
 
 
 
        for (int i = n-1; i >= 1; i--) 
        {
 
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
 
 
            for (int j = i; j <= n; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
 
	
	
	}

}