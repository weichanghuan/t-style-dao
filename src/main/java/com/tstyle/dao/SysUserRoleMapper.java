package com.tstyle.dao;

import com.tstyle.po.SysUserRole;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Sat Jan 20 16:19:48 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Sat Jan 20 16:19:48 CST 2018
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Sat Jan 20 16:19:48 CST 2018
     */
    int insertSelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Sat Jan 20 16:19:48 CST 2018
     */
    SysUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Sat Jan 20 16:19:48 CST 2018
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Sat Jan 20 16:19:48 CST 2018
     */
    int updateByPrimaryKey(SysUserRole record);
}