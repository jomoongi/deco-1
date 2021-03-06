package calendar.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import calendar.service.CalendarService;

@Service("calendarService")
public class CalendarServiceImpl implements CalendarService {
	
	@Resource(name = "calendarMapper")
	private CalendarMapper calendarMapper;

	@Override
	public List<Map<String, Object>> selectCalenderList() throws Exception {
		
		return calendarMapper.selectCalenderList();
	}

	@Override
	public List<Map<String, Object>> selectDetail(String no) throws Exception {
		// TODO Auto-generated method stub
		return calendarMapper.selectDetail(no);
	}

	@Override
	public Object writeAll(Map<String, Object> params) {
		// TODO Auto-generated method stub
		try {
			return calendarMapper.writeAll(params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return params;
		
	}

	@Override
	public HashMap<String, Object> selectLast(int tempMember) throws Exception {
		// TODO Auto-generated method stub
		return calendarMapper.selectLast(tempMember);
	}

	@Override
	public HashMap<String, Object> insertImage(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return calendarMapper.insertImage(params);
	}

	// 0525 여림 추가
	@Override
	public int updatePtHit(Map<String, Object> map) throws Exception {
		
		return calendarMapper.updatePtHit(map);
	}

	// 0525 여림 추가
	@Override
	public Map<String, Object> selectCalenderDetailInfo(Map<String, Object> map) throws Exception {
		
		return calendarMapper.selectCalenderDetailInfo(map);
	}


}
