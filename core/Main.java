import collections.CollectionPractice;
import core.PracticeModule;
import exceptions.ExceptionPractice;
import lambdas.LambdaPractice;
import streams.StreamPractice;

void main() {
    List<PracticeModule> modules = List.of(
            new CollectionPractice(),
            new ExceptionPractice(),
            new LambdaPractice(),
            new StreamPractice()
    );

    modules.forEach(PracticeModule::run);
}
