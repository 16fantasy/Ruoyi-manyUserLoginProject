package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.Myuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-12-19
 */
@Mapper
public interface MyuserMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Myuser selectMyuserById(Long id);


    public Myuser selectMyUserByUsername(String username);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param myuser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Myuser> selectMyuserList(Myuser myuser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param myuser 【请填写功能名称】
     * @return 结果
     */
    public int insertMyuser(Myuser myuser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param myuser 【请填写功能名称】
     * @return 结果
     */
    public int updateMyuser(Myuser myuser);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMyuserById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMyuserByIds(Long[] ids);
}
