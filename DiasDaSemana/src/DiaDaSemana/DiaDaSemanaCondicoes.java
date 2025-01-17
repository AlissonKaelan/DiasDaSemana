/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DiaDaSemana;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Alisson Kaelan
 */
public class DiaDaSemanaCondicoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate dataAtual = LocalDate.now();
        
        DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();
      
        System.out.println("O dia da semana atual com base na data do dispositivo: ");
        
        switch (diaDaSemana) {
            case MONDAY:
                System.out.println("Hoje é segunda-feira");
                break;
            case TUESDAY:
                System.out.println("Hoje é terça-feira");
                break;
            case WEDNESDAY:
                System.out.println("Hoje é quarta-feira");
                break;
            case THURSDAY:
                System.out.println("Hoje é quinta-feira");
                break;
            case FRIDAY:
                System.out.println("Hoje é sexta-feira");
                break;
            case SATURDAY:
                System.out.println("Hoje é Sábado");
                break;
            case SUNDAY:
                System.out.println("Hoje é Domingo");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }

        
        
    }
    

