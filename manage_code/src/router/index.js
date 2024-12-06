	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import news from '@/views/news/list'
	import zhaopinxinxi from '@/views/zhaopinxinxi/list'
	import yonghu from '@/views/yonghu/list'
	import chat from '@/views/chat/list'
	import gangweishenqing from '@/views/gangweishenqing/list'
	import zhaopinfenlei from '@/views/zhaopinfenlei/list'
	import storeup from '@/views/storeup/list'
	import config from '@/views/config/list'
	import users from '@/views/users/list'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/news',
			name: '系统资讯',
			component: news
		}
		,{
			path: '/zhaopinxinxi',
			name: '招聘信息',
			component: zhaopinxinxi
		}
		,{
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}
		,{
			path: '/chat',
			name: '在线咨询',
			component: chat
		}
		,{
			path: '/gangweishenqing',
			name: '岗位申请',
			component: gangweishenqing
		}
		,{
			path: '/zhaopinfenlei',
			name: '招聘分类',
			component: zhaopinfenlei
		}
		,{
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		,{
			path: '/users',
			name: '管理员',
			component: users
		}
		]
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
