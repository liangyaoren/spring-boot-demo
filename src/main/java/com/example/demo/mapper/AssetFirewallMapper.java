package com.example.demo.mapper;

import com.example.demo.model.AssetFirewall;
import com.example.demo.model.AssetFirewallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetFirewallMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    long countByExample(AssetFirewallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByExample(AssetFirewallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insert(AssetFirewall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insertSelective(AssetFirewall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    List<AssetFirewall> selectByExample(AssetFirewallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    AssetFirewall selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") AssetFirewall record, @Param("example") AssetFirewallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExample(@Param("record") AssetFirewall record, @Param("example") AssetFirewallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKeySelective(AssetFirewall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset_firewall
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKey(AssetFirewall record);
}