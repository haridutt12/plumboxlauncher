package in.oogway.plumbox.launcher;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public interface Sink {
    void flush(SparkSession ss, Dataset<Row> output);
}

