# dienst2-api-client-java

[ ![Download](https://api.bintray.com/packages/wisvch/maven/dienst2-api-client-java/images/download.svg) ](https://bintray.com/wisvch/maven/dienst2-api-client-java/_latestVersion)

Java API client library for Dienst2

Provides model classes to use with e.g. Spring RestTemplate. Spring is an optional dependency; the model classes may be used with other REST libraries.

## Usage

Include wisvch maven repository, then include this library as dependency:

````gradle
repositories {
    mavenCentral()
    maven {
        url "https://dl.bintray.com/wisvch/maven"
    }
}

dependencies {
    compile "ch.wisv:dienst2-api-client-java:+"
}
````

For example usage, [see tests](src/test/java/ch/wisv/dienst2/apiclient/Dienst2ModelTests.java).
