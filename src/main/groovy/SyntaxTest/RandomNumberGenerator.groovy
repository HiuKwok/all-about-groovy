package SyntaxTest

import java.util.concurrent.ThreadLocalRandom

class RandomNumberGenerator {

    static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt();
        println "Random number: " + random
    }
}
