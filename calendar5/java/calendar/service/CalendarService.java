package calendar.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CalendarService {

	List<Map<String, Object>> selectCalenderList() throws Exception;

	List<Map<String, Object>> selectDetail(String no) throws Exception;

	Object writeAll(Map<String, Object> params) throws Exception;//(insert)Error : unsupported return type

	HashMap<String, Object> selectLast(int tempMember) throws Exception;

	HashMap<String, Object> insertImage(Map<String, Object> params) throws Exception;//(insert)Error : unsupported return type

	// 0525 여림 추가
	int updatePtHit(Map<String, Object> map) throws Exception;

	// 0525 여림 추가
	Map<String, Object> selectCalenderDetailInfo(Map<String, Object> map) throws Exception;

}
