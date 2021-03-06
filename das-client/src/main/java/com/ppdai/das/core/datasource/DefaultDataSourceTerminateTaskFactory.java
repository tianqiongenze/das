package com.ppdai.das.core.datasource;

public class DefaultDataSourceTerminateTaskFactory implements DataSourceTerminateTaskFactory {
    @Override
    public DataSourceTerminateTask createTask(SingleDataSource oldDataSource) {
        DataSourceTerminateTask task = new DefaultDataSourceTerminateTask(oldDataSource);
        return task;
    }

    @Override
    public int getOrder() {
        return LOWEST_PRECEDENCE;
    }
}
