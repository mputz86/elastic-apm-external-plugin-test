package externalplugin;

public class Main {
    // Run with JVM options:
    // -Delastic.apm.plugin.instrumented_class="externalplugin.TestClass" -Delastic.apm.plugin
    // .instrumented_method="traceMe"
    public static void main(String[] args) {
        System.out.println("Instrumented class: "
            + System.getProperty("elastic.apm.plugin.instrumented_class", "NOT FOUND"));
        co.elastic.apm.attach.ElasticApmAttacher.attach();
        new TestClass().traceMe();
    }
}
