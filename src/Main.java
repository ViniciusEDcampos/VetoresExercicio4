import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        String vetor[] = new String[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite oito Elementos: ");
        for(int i=0;i<8;i++){
            vetor[i] = scanner.nextLine();
        }

        System.out.print("Numeros digitados invertidos: ");
        for(int i=7;i>=0;i--){
            if(i == 0){
                System.out.print(vetor[i]);
                System.out.println("");
            }else{
                System.out.print(vetor[i]+ ", ");
            }

        }

    }
}