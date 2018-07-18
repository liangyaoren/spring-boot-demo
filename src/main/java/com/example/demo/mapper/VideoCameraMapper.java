package com.example.demo.mapper;

import com.example.demo.model.VideoCamera;
import com.example.demo.model.VideoCameraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoCameraMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    long countByExample(VideoCameraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByExample(VideoCameraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insert(VideoCamera record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int insertSelective(VideoCamera record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    List<VideoCamera> selectByExample(VideoCameraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    VideoCamera selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") VideoCamera record, @Param("example") VideoCameraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByExample(@Param("record") VideoCamera record, @Param("example") VideoCameraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKeySelective(VideoCamera record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_camera
     *
     * @mbg.generated Wed Jul 18 09:48:47 CST 2018
     */
    int updateByPrimaryKey(VideoCamera record);
}