package com.example.demo.model;

public class WorkOrderWithBLOBs extends WorkOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.process_description
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    private String processDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.remark
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.process_description
     *
     * @return the value of work_order.process_description
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    public String getProcessDescription() {
        return processDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.process_description
     *
     * @param processDescription the value for work_order.process_description
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    public void setProcessDescription(String processDescription) {
        this.processDescription = processDescription == null ? null : processDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.remark
     *
     * @return the value of work_order.remark
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.remark
     *
     * @param remark the value for work_order.remark
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}