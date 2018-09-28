package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.demo.vo.RequestVo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/openApi/workOrder.do")
public class WorkOrderApi  {
	//private static final Logger LOG = Logger.getLogger(WorkOrderApi.class);
	String URL="";//菜鸟URL
	// OpenApi
	
	
	@RequestMapping(params = "action=notify", method = RequestMethod.POST)
	public void WorkOrderNotify(RequestVo requestVo, HttpServletResponse response, HttpServletRequest request, HttpSession session) {
		//System.out.println("未校验前数据：----------："+JSONObject.toJSONString(requestVo));
		String id=request.getParameter("logistics_interface");
		System.out.println(requestVo);
		try {
			// 签名校验
			if (true) {
				//System.out.println("/n 菜鸟调用仲裁接口的数据：--------"+JSONObject.toJSONString(requestVo));
				String msg_type = requestVo.getMsg_type();
				if ("WORKPLATFORM_WORKORDER_NOTIFY".equals(msg_type)) {
					// 工单下发
					
				} else if ("WORKPLATFORM_WORKORDER_PROCESS_NOTIFY"
						.equals(msg_type)) {
					// 工单进度下发

				} else if ("WORKPLATFORM_WORKORDER_TASK_NOTIFY"
						.equals(msg_type)) {
					// 工单任务下发
					
				}
			}else{
				//签名不合格
				//sendJsonToClient(new ResponseMessage("false","1"), response);
				return;
			}
			//sendJsonToClient(new ResponseMessage("true"), response);
			return;
		} catch (Exception e) {
			//sendJsonToClient(new ResponseMessage("false","7"), response);
			//LOG.error("菜鸟平台 工单下发、工单进度下发、后续任务下发接口接收异常", e);
		}
	}


	
	
	
	
	
	
	
	
	
	
	

	
}
