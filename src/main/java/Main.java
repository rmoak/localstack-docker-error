import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.utility.DockerImageName;

import static org.testcontainers.containers.localstack.LocalStackContainer.Service.DYNAMODB;

public class Main {


    public static void main(String[] args) {

        LocalStackContainer localstack =
                new LocalStackContainer(DockerImageName.parse("localstack/localstack:latest")
                        .asCompatibleSubstituteFor("localstack/localstack"));
        localstack.withServices(DYNAMODB).start();
    }
}
