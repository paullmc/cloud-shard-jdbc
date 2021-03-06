package cloud.shard.provider.mapper;

import org.apache.ibatis.annotations.Param;
import shard.jdbc.common.entity.TableOne;
import shard.jdbc.common.entity.TableOneExample;
import java.util.List;

public interface TableOneMapper {

    TableOne selectOneByPhone(@Param("phone") String phone) ;

    int countByExample(TableOneExample example);

    int deleteByExample(TableOneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableOne record);

    int insertSelective(TableOne record);

    List<TableOne> selectByExample(TableOneExample example);

    TableOne selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableOne record, @Param("example") TableOneExample example);

    int updateByExample(@Param("record") TableOne record, @Param("example") TableOneExample example);

    int updateByPrimaryKeySelective(TableOne record);

    int updateByPrimaryKey(TableOne record);
}