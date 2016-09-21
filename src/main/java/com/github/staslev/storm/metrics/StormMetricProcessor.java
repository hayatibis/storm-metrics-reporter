package com.github.staslev.storm.metrics;

import com.yammer.metrics.core.MetricName;
import com.yammer.metrics.core.MetricsRegistry;
import org.apache.storm.metric.api.IMetricsConsumer;

/**
 * Responsible for processing a metric reported by Storm.
 * <br/><br/>
 * NOTE: The implementing class must take into account that the reporting granularity is taskId,
 * that is, it should make sure it does not overwrite values by aggregating incoming value incorrectly (for instance,
 * aggregating per workerHost-port-componentId is wrong, since the various tasks might overwrite each other's values.
 */
public interface StormMetricProcessor {

  MetricsRegistry METRICS_REGISTRY = new MetricsRegistry();

  /**
   * Returns the metric name for the storm metric produced by a task.
   *
   * @param metric storm metric object
   * @param taskInfo information about the task that generates the metric
   * @return the name for the yammer metric
   */
  MetricName name(final Metric metric, final IMetricsConsumer.TaskInfo taskInfo);

  /**
   * Processes the storm metric
   *
   * @param metric storm metric object
   * @param taskInfo information about the task that generates the metric
   */
  void process(final Metric metric, final IMetricsConsumer.TaskInfo taskInfo);
}