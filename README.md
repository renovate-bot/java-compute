# Google Compute Engine Client for Java

Java idiomatic client for [Compute Engine][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

> Note: This client is a work-in-progress, and may occasionally
> make backwards-incompatible changes.

## Quickstart


If you are using Maven, add this to your pom.xml file:

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-compute</artifactId>
  <version>1.2.0-alpha</version>
</dependency>

```

If you are using Gradle without BOM, add this to your dependencies
```Groovy
compile 'com.google.cloud:google-cloud-compute:1.3.0-alpha'
```

If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-compute" % "1.3.0-alpha"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Compute Engine [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Compute Engine.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-compute` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-compute` as a dependency in your code.

## About Compute Engine


[Compute Engine][product-docs] delivers virtual machines running in Google's innovative data centers and worldwide fiber network. Compute Engine's tooling and workflow support enable scaling from single instances to global, load-balanced cloud computing. Compute Engine's VMs boot quickly, come with persistent disk storage, deliver consistent performance and are available in many configurations.



See the [Compute Engine client library docs][javadocs] to learn how to
use this Compute Engine Client Library.


### Example
The following example creates a GCE address, then lists all the available addresses in the region and in the whole project and eventually deletes the newly created address.

```java
import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressesClient;
import com.google.cloud.compute.v1.AddressesScopedList;
import com.google.cloud.compute.v1.Operation;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import java.util.Map;

public class ComputeExample {

  public static void main(String[] args) throws IOException, InterruptedException {
    final String project = "PROJECT_NAME";
    final String region = "REGION";
    final String address = "test-address-21";

    AddressesClient addressesClient = AddressesClient.create();

    // AddressClient#insert()
    System.out.println("\n===============\nAddressClient#insert()\n===============");
    Operation insertResponse =
        addressesClient.insert(project, region, Address.newBuilder().setName(address).build());
    System.out.println(JsonFormat.printer().print(insertResponse) + "\n");
    Thread.sleep(1000L);

    // AddressClient#list()
    System.out.println("\n===============\nAddressClient#list()\n===============");
    for (Address addr : addressesClient.list(project, region).iterateAll()) {
      System.out.println(JsonFormat.printer().print(addr));
    }

    // AddressClient#aggregatedList()
    System.out.println("\n===============\nAddressClient#aggregatedList()\n===============");
    for (Map.Entry<String, AddressesScopedList> addr :
        addressesClient.aggregatedList(project).iterateAll()) {
      System.out.println("KEY: " + addr.getKey());
      System.out.println(JsonFormat.printer().print(addr.getValue()));
    }

    // AddressClient#delete()
    System.out.println("\n===============\nAddressClient#delete()\n===============");
    Operation deleteResponse = addressesClient.delete(project, region, address);
    System.out.println(JsonFormat.printer().print(deleteResponse) + "\n");
  }
}

```





## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Compute Engine uses HTTP/JSON for the transport layer.

## Java Versions

Java 7 or above is required for using this client.

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


It is currently in major version zero (``0.y.z``), which means that anything may change at any time
and the public API should not be considered stable.

## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.

## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/compute/
[javadocs]: https://googleapis.dev/java/google-cloud-compute/latest/index.html
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-compute/java11.html
[stability-image]: https://img.shields.io/badge/stability-alpha-orange
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-compute.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-compute&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-compute/blob/master/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-compute/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-compute/blob/master/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=compute.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png
