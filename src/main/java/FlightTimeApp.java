import org.apache.hadoop.mapred.lib.MultipleInputs;
import org.apache.hadoop.mapreduce.Job;

import java.io.IOException;

public class FlightTimeApp {
    public static void main(String[] args) throws IOException {
        Job job = Job.getInstance();
        job.setJarByClass(FlightTimeApp.class);
        job.setJobName("Flight Time");
        MultipleInputs.addInputPath(job, new Path(args[0]));
    }

}
