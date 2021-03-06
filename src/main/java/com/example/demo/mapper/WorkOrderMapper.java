package com.example.demo.mapper;

import com.example.demo.model.WorkOrder;
import com.example.demo.model.WorkOrderExample;
import com.example.demo.model.WorkOrderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    long countByExample(WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByExample(WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insert(WorkOrderWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insertSelective(WorkOrderWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    List<WorkOrderWithBLOBs> selectByExampleWithBLOBs(WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    List<WorkOrder> selectByExample(WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    WorkOrderWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") WorkOrderWithBLOBs record, @Param("example") WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") WorkOrderWithBLOBs record, @Param("example") WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExample(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKeySelective(WorkOrderWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(WorkOrderWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKey(WorkOrder record);
}