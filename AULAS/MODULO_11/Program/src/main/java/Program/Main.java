package Program;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); //cria a variável date e já instancia ela recebendo a data atual
        System.out.println("Data atual: " + date);
        System.out.println("--------------------------");

        LocalDateTime dateTime = LocalDateTime.now(); //cria e já instancia a variável recebendo o data/hora local
        System.out.println("Data e hora atuais: " + dateTime);
        System.out.println("--------------------------");

        // cria e já instancia a variável recebendo o data/hora GLOBAL
        // identificando com o Z no final para mostar que é uma data hora GMT
        Instant instant = Instant.now();
        System.out.println("Data e hora atuais Instant: " + instant);
        System.out.println("--------------------------");

        //recebendo uma data/hora textual ISO 8601 e gerar um Data/hora a partir dele
        LocalDate dateIso = LocalDate.parse("2022-02-20");
        LocalDateTime dateIso2 = LocalDateTime.parse("2022-02-20T10:00:00");
        System.out.println("Data a partir de texto ISO 8601: " + dateIso);
        System.out.println("--------------------------");
        System.out.println("Data e hora a partir de texto ISO 8601: " + dateIso2);
        System.out.println("--------------------------");

        //recbendo uma data/hora textual ISO 8601 e gerando um data/hora global
        Instant instantIso = Instant.parse("2022-02-20T10:00:00Z");
        Instant instantIso2 = Instant.parse("2022-02-20T10:00:00-03:00");//aqui o compilador se vira para calcular o horário do fuso
        System.out.println("Data/Hora Global a partir de texto ISO 8601: " + instantIso);
        System.out.println("--------------------------");
        System.out.println("Data/Hora Global a partir de texto ISO 8601 convertendo para o fuso: " + instantIso2);
        System.out.println("--------------------------");

        //convertendo texto em formato customizado em data/hora
        //criando a classe para formatar a data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("23/03/2026", formatter);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("23/03/2026 10:00:00", formatter2);
        System.out.println("Data customizada a partir texto ISO 8601: " + localDate);
        System.out.println("--------------------------");
        System.out.println("Data/Hora customizada a partir texto ISO 8601: " + localDateTime);
        System.out.println("--------------------------");

        //instanciando datas e horário a partir de dados isolados
        LocalDate dateIsolado = localDate.of(2026, 3, 23);
        System.out.println("Data a partir de dados isolados: " + dateIsolado);
        System.out.println("--------------------------");

        LocalDateTime dateTimeIsolado = LocalDateTime.of(2026, 3, 23, 15, 20);
        System.out.println("Data/hora a partir de dados isolados: " + dateTimeIsolado);
        System.out.println("--------------------------");

        //Formatando o data/hora em um texto customizado
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data: " + date.format(dateFormatter));
        System.out.println("--------------------------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data/Hora: " + dateTime.format(dateTimeFormatter));
        System.out.println("--------------------------");

        DateTimeFormatter dateFormatterGlobal =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                        .withZone(ZoneId.systemDefault());

        System.out.println("Data/Hora Global " + dateFormatterGlobal.format(instant));
        System.out.println("--------------------------");

        //Fazendo cálculos com Data/Hora
        LocalDate date3 = LocalDate.parse("2022-02-20");
        LocalDateTime dateTime3 = LocalDateTime.parse("2022-02-20T10:00:00");
        Instant dateInstant3 = Instant.parse("2022-02-20T10:00:00Z");

        LocalDate semanaPassada = date3.minusDays(7);
        LocalDate proximaPassada = date3.plusDays(7);
        System.out.println("------------------------------------");
        System.out.println("Semana Passada: " + semanaPassada);
        System.out.println("Proxima Semana: " + proximaPassada);

        LocalDateTime semanaPassadaTime = dateTime3.minusDays(7);
        LocalDateTime proximaPassadaTime = dateTime3.plusDays(7);
        System.out.println("------------------------------------");
        System.out.println("Semana Passada com Hora: " + semanaPassadaTime);
        System.out.println("Proxima Semana com Hora: " + proximaPassadaTime);

        Instant semanaPassadaInstant = dateInstant3.minus(7, ChronoUnit.DAYS);
        Instant proximaPassadaInstant = dateInstant3.plus(7, ChronoUnit.DAYS);
        System.out.println("------------------------------------");
        System.out.println("Semana Passada Instant: " + semanaPassadaInstant);
        System.out.println("Proxima Semana Instant: " + proximaPassadaInstant);


        // calculando a duração entre duas datas/hora
        System.out.println("------------------------------------");
        Period t1 = Period.between(semanaPassada, date3);
        System.out.println("T1: " + t1.getDays());
        System.out.println("------------------------------------");
        Duration t2 = Duration.between(semanaPassadaTime, dateTime3);
        System.out.println("T2: " + t2.toDays());


    }
}