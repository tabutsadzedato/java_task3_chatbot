package ge.edu.btu.chat.server;

public class ServerThread extends Thread{

    private String question;

    public ServerThread(String q){
        this.question = q;
    }

    public void run(){
        System.out.println(answerQuestion(this.question));
    }

    private String answerQuestion(String question){
        if(question.equals("მითხარი ეროვნული ვალუტის კურსი")){
            return "1USD = 3.31GEL";
        }else if(question.equals("მაჩვენე ფილიალები")){
            return "შარტავას 26 \nკანდელაკის 2 \nვაჟა ფშაველას 15 \nპეკინის 25";
        }else{
            return "სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ";
        }
    }
}