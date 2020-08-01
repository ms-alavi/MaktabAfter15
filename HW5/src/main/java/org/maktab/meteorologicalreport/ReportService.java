package org.maktab.meteorologicalreport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReportService {
    InformationRepository repository;
    List<Information> infomation ;
    public ReportService(InformationRepository repository) {
        this.repository = repository;
        infomation = repository.fetchAll();
    }

    public List<CityInformation> sumByCity(int year) throws Exception {

        List<CityInformation> info = new ArrayList<>();
        for (int i = 0; i < infomation.size(); i++) {
            Information information = infomation.get(i);
            String year1 = information.getDate().substring(0, 4);
            if (year == Integer.parseInt(year1))
                info.add(new CityInformation(information.getCityName(), information.getAmount()));
            /*for (int j = 0; j <info.size() ; j++) {
                if (info.get(j).getCity().equals(infomation.get(j).getCity())){
                    //get amount be set with object
                }

            }*/
        }
       Collections.sort(info);
        return info;
    }

    public List<CityMonthInformation> averageByCityAndMonth(int year) throws Exception {
        List<Information> information = repository.fetchAll();
        List<CityMonthInformation> info = new ArrayList<>();

        for (Information element:information
             ) {
            String year1 = element.getDate().substring(0, 4);
            if (year == Integer.parseInt(year1));
            int month=Integer.parseInt(element.getDate().substring(5,7));
            double day;
            if (month<7)day=31;
            else day=30;
            info.add(new CityMonthInformation(element.getCityName(),month,element.getAmount()/day));
        }
        return info;
    }

    public static void main(String[] args) {
        ReportService service = new ReportService(new InformationRepository() {
            @Override
            public List<Information> fetchAll()  {
                return Arrays.asList(
                        new Information("Kerman", "1395/03/11", 62L), new Information("Tehran", "1395/09/12", 90L),
                        new Information("Tehran", "1396/11/30", 31L), new Information("Semnan", "1396/01/13", 93L)
                );
            }
        });
        try {
            List<CityInformation> sumResults = service.sumByCity(1396);
            System.out.printf("sum total: %d%n", sumResults.size());
            CityInformation sumFirst = sumResults.get(0);
            System.out.printf("1: %s %d%n", sumFirst.getCity(), sumFirst.getSum());
            CityInformation sumSecond = sumResults.get(1);
            System.out.printf("2: %s %d%n", sumSecond.getCity(), sumSecond.getSum());
        } catch (Exception e) {
            e.printStackTrace();
        }


        try{
            List<CityMonthInformation> avgResults = service.averageByCityAndMonth(1395);
            System.out.printf("avg total: %d%n", avgResults.size());
            CityMonthInformation avgFirst = avgResults.get(0);
            System.out.printf("1: %s %d %f%n", avgFirst.getCity(), avgFirst.getMonth(), avgFirst.getAverage());
            CityMonthInformation avgSecond = avgResults.get(1);
            System.out.printf("2: %s %d %f%n", avgSecond.getCity(), avgSecond.getMonth(), avgSecond.getAverage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
