import collections.CollectionPractice;
import core.PracticeModule;
import exceptions.ExceptionPractice;
import jdbc.JdbcPractice;
import lambdas.LambdaPractice;
import streams.StreamPractice;

void main() throws Exception{

    List<PracticeModule> modules = List.of(
//            new CollectionPractice(),
//            new ExceptionPractice(),
//            new LambdaPractice(),
//            new StreamPractice(),
            new JdbcPractice()
    );

    for (PracticeModule module : modules){
        module.run();
    }
}
