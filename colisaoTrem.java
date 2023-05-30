import java.util.InputMismatchException;
import java.util.Scanner;

public class colisaoTrem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double VelTremA = -1, VelTremB = 1;
            int PosTremA = -1, PosTremB = -1;
            try {
//
                while (VelTremA < 0 || VelTremA > 300) {
                    System.out.println("Insira a velocidade do trem A em KM/h positivo: ");

                    VelTremA = sc.nextDouble();

                }
                while (PosTremA < 0 || PosTremA > 10000) {
                    System.out.println("Insira a posição do trem A em KM: ");
                    PosTremA = sc.nextInt();
                    sc.nextLine();
                }
                while (VelTremB > 0 || VelTremB < -300) {
                    System.out.println("Insira a velocidade do trem B em KM negativo: ");
                    VelTremB = sc.nextDouble();
                }
                while (PosTremB < 0 || PosTremB > 10000) {
                    System.out.println("Insira a posição do trem B em KM: ");
                    PosTremB = sc.nextInt();
                }

                double tempo = (PosTremA - PosTremB) / (VelTremB - VelTremA);
                double PosFinalA = PosTremA + (VelTremA * tempo);


                System.out.printf("A colisão dos trens acontecerá no KM: %.0f", PosFinalA);
                double temposeg = tempo * 3600;
                System.out.println("\nE ocorrerá após " + temposeg + " segundos");
                if (tempo < 1) {
                    double tempominuto = ((tempo * 10) * 0.60) * 10;
                    System.out.printf("Às 17:%.0f:00 horas", tempominuto);
                } else {
                    System.out.printf("Às %.0f:00:00 horas", tempo + 17);
                }
                System.out.println("\nFIM DO PROGRAMA!!");

            } catch (InputMismatchException e) {
                System.out.println("Você digitou um caractere inválido, digite novamente...");
                sc.nextLine();
            }
            System.out.println("Deseja tentar novamente?\n[1]SIM\n[2]NÃO");
            int op = sc.nextInt();
            if(op != 1){
                break;
            }
        }
    }
}