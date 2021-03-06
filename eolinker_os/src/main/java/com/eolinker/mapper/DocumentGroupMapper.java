package com.eolinker.mapper;

import java.util.List;

import com.eolinker.pojo.Document;
import com.eolinker.pojo.DocumentGroup;
import org.apache.ibatis.annotations.Param;

/**
 * 项目文档分组[数据库操作]
 * @name eolinker ams open source，eolinker开源版本
 * @link https://www.eolinker.com/
 * @package eolinker
 * @author www.eolinker.com 广州银云信息科技有限公司 2015-2018
 * eoLinker是目前全球领先、国内最大的在线API接口管理平台，提供自动生成API文档、API自动化测试、Mock测试、团队协作等功能，旨在解决由于前后端分离导致的开发效率低下问题。
 * 如在使用的过程中有任何问题，欢迎加入用户讨论群进行反馈，我们将会以最快的速度，最好的服务态度为您解决问题。
 *
 * eoLinker AMS开源版的开源协议遵循GPL V3，如需获取最新的eolinker开源版以及相关资讯，请访问:https://www.eolinker.com/#/os/download
 *
 * 官方网站：https://www.eolinker.com/ 官方博客以及社区：http://blog.eolinker.com/
 * 使用教程以及帮助：http://help.eolinker.com/ 商务合作邮箱：market@eolinker.com
 * 用户讨论QQ群：707530721
 */
public interface DocumentGroupMapper
{

	/**
	 * 添加文档分组
	 * 
	 * @param documentGroup
	 * @return
	 */
	public Integer addDocumentGroup(DocumentGroup documentGroup);

	/**
	 * 添加文档子分组
	 * 
	 * @param documentGroup
	 * @return
	 */
	public int addChildGroup(DocumentGroup documentGroup);

	/**
	 * 删除父文档分组
	 * 
	 * @param groupID
	 * @return
	 */
	public int deleteParentalGroup(@Param("groupID") int groupID);

	/**
	 * 删除子文档分组
	 * 
	 * @param groupID
	 * @return
	 */
	public int deleteChildrenGroup(@Param("parentGroupID") int parentGroupID);

	/**
	 * 删除已删除分组的文档
	 * 
	 * @param groupID
	 * @return
	 */
	public int deleteGroupDocument(@Param("groupID") int groupID);

	/**
	 * 获取父分组
	 * 
	 * @param groupID
	 * @return
	 */
	public List<DocumentGroup> getParentalGroup(@Param("projectID") int projectID);

	/**
	 * 获取子分组
	 * 
	 * @param groupID
	 * @param parentGroupID
	 * @return
	 */
	public List<DocumentGroup> getChildrenGroup(@Param("projectID") int projectID,
			@Param("parentGroupID") int parentGroupID);

	/**
	 * 获取文档分组排序
	 * 
	 * @param projectID
	 * @return
	 */
	public String getOrderList(@Param("projectID") int projectID);

	/**
	 * 修改父文档分组信息
	 * 
	 * @param documentGroup
	 * @return
	 */
	public int editParentalGroup(DocumentGroup documentGroup);

	/**
	 * 修改子文档分组信息
	 * 
	 * @param documentGroup
	 * @return
	 */
	public int editChildrenGroup(DocumentGroup documentGroup);

	/**
	 * 判断文档分组和用户是否匹配
	 * 
	 * @param groupID
	 * @param userID
	 * @return
	 */
	public Integer checkGroupPermission(@Param("groupID") int groupID, @Param("userID") int userID);

	/**
	 * 获取文档分组名称
	 * 
	 * @param groupID
	 * @return
	 */
	public String getGroupName(@Param("groupID") int groupID);

	/**
	 * 更新文档分组排序
	 * 
	 * @param projectID
	 * @param orderList
	 * @return
	 */
	public int updateGroupOrder(@Param("projectID") int projectID, @Param("orderList") String orderList);

	/**
	 * 获取全部分组数据
	 * 
	 * @param projectID
	 * @param groupID
	 * @return
	 */
	public DocumentGroup getGroupData(@Param("projectID") int projectID, @Param("groupID") int groupID);

	/**
	 * 获取子分组数据
	 * 
	 * @param projectID
	 * @param groupID
	 * @return
	 */
	public List<DocumentGroup> getChildrenGroupData(@Param("projectID") int projectID,
			@Param("parentGroupID") int parentGroupID);

	/**
	 * 获取文档数据
	 * 
	 * @param projectID
	 * @param groupID
	 * @return
	 */
	public List<Document> getDocumentData(@Param("projectID") int projectID, @Param("groupID") int groupID);

	/**
	 * 获取父分组ID
	 * @param groupID
	 * @return
	 */
	public Integer getParentGroupID(@Param("groupID")Integer groupID);

}
