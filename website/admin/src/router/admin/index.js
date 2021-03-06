import marketing from '@/router/admin/marketing'
import member from '@/router/admin/member'
import order from '@/router/admin/order'
import store from '@/router/admin/store'
import doctorManger from '@/router/admin/doctorManger'
import prescriptionManger from '@/router/admin/prescriptionManger'
const routes = [
  {
    path: '/admin/home',
    name: 'adminHome',
    component: () => import('@/view/admin/home'),
    children: [
      {
        path: '/admin/home/shopMain',
        name: 'shopMain',
        component: () => import('@/view/admin/layout/shopMain')
      },
      {
        path: '/admin/home/main',
        name: 'adminMain',
        component: () => import('@/view/admin/index/main'),
        children: [
          // 概况系列子路由
          {
            path: '/admin/home/main/overviewOfMall',
            name: 'shop_view',
            meta: {
              crumbTitle: '',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/overviewOfMall/overviewOfMall'
              )
          },
          // 营销日历
          {
            path: '/admin/home/main/overviewOfMall/calendar',
            name: 'calendar',
            meta: {
              crumbTitle: 'router.calendar',
              meta: 'first_web_manage',
              category: 'shop_view'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/overviewOfMall/calendarMain'
              )
          },
          // 营销日历  添加/编辑事件
          {
            path: '/admin/home/main/overviewOfMall/addCalendarMain',
            name: 'addCalendarMain',
            meta: {
              crumbTitle: 'router.addCalendarMain',
              meta: 'first_web_manage',
              category: 'shop_view'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/overviewOfMall/addCalendarMain'
              )
          },
          // 店铺助手
          {
            path: '/admin/home/main/overviewOfMall/taskList',
            name: 'task_list_view',
            meta: {
              crumbTitle: 'router.taskList',
              meta: 'first_web_manage',
              category: 'shop_view'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/overviewOfMall/taskList'
              )
          },
          // 公告
          // {
          //   path: '/admin/home/main/overviewOfMall/noticeList',
          //   name: 'notice_list_view',
          //   meta: {
          //     crumbTitle: '',
          //     meta: 'first_web_manage',
          //     category: 'shop_view'
          //   },
          //   component: () =>
          //         import(
          //           '@/view/admin/index/leftNavComponents/first_web_manage/overviewOfMall/noticeList'
          //         )
          // },
          // // 公告详情
          // {
          //   path: '/admin/home/main/overviewOfMall/noticeDetail',
          //   name: 'notice_detail_view',
          //   meta: {
          //     crumbTitle: '',
          //     meta: 'first_web_manage',
          //     category: 'shop_view'
          //   },
          //   component: () =>
          //     import(
          //       '@/view/admin/index/leftNavComponents/first_web_manage/overviewOfMall/noticeDetail'
          //     )
          // },
          // 概况 - 概况统计页面
          {
            path: '/admin/home/main/overviewStatistics',
            name: 'analysis_basic',
            meta: {
              crumbTitle: 'router.analysis_basic',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/overviewStatistics/overviewStatistics'
              )
          },
          // 概况 - 搜索统计
          {
            path: '/admin/home/main/searchStatistics',
            name: 'search_summary',
            meta: {
              crumbTitle: 'router.search_summary',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/searchStatistics/searchStatistics'
              )
          },
          // 概况 - 访问分析
          {
            path: '/admin/home/main/visitAnalysis',
            name: 'analysis_visit',
            meta: {
              crumbTitle: 'router.analysis_visit',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/visitAnalysis/visitAnalysis'
              )
          },
          // 概况 - 来源分析
          {
            path: '/admin/home/main/sourceAnalysis',
            name: 'analysis_visit_source',
            meta: {
              crumbTitle: 'router.analysis_visit_source',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/sourceAnalysis/sourceAnalysis'
              )
          },
          // 概况 - 资产管理
          {
            path: '/admin/home/main/assetsManage',
            name: 'asset_summary',
            meta: {
              crumbTitle: 'router.asset_summary',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/assetManagement/assetsManage'
              )
          },
          // 概况 - 资产管理明细
          {
            path: '/admin/home/main/assetsManage/detail',
            name: 'asset_summary_detail',
            meta: {
              crumbTitle: 'router.asset_summary',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/assetManagement/AssetsDetail'
              )
          },
          // 实时概况
          {
            path: '/admin/home/main/realTimeOverview',
            name: 'situation',
            meta: {
              crumbTitle: 'router.situation',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/realTimeOverview/allRealTime'
              )
          },
          // 销售报表
          {
            path: '/admin/home/main/salesreport',
            name: 'sales_report',
            meta: {
              crumbTitle: 'router.sales_report',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/salesReport/salesReport'
              )
          },
          // 埋点
          {
            path: '/admin/home/main/anchorPoints/list',
            name: 'anchor_points',
            meta: {
              crumbTitle: 'router.anchor_points',
              meta: 'first_web_manage'
            },
            component: () =>
                import(
                  '@/view/admin/index/leftNavComponents/first_web_manage/anchorPoints/anchorPointsList'
                )
          },
          // 埋点报表
          {
            path: '/admin/home/main/anchorPoints/report',
            name: 'anchor_points_report',
            meta: {
              crumbTitle: 'router.anchor_points_report',
              meta: 'first_web_manage'
            },
            component: () =>
                import(
                  '@/view/admin/index/leftNavComponents/first_web_manage/anchorPoints/anchorPointsReport'
                )
          },
          // 用户画像
          {
            path: '/admin/home/main/userportrait',
            name: 'analysis_portrait',
            meta: {
              crumbTitle: 'router.analysis_portrait',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/analysisPortrait/userportrait'
              )
          },
          // 概况 - 交易统计
          {
            path: '/admin/home/main/tradesStatistics',
            name: 'trades_summary',
            meta: {
              crumbTitle: 'router.trades_summary',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/tradesStatistics/tradesStatistics'
              )
          },
          // 概况 - 商品统计页面
          {
            path: '/admin/home/main/goodsStatistics',
            name: 'goods_summary',
            meta: {
              crumbTitle: 'router.goods_summary',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/goodsStatistics/goodsStatistics'
              )
          },
          // 概况 - 用户统计页面
          {
            path: '/admin/home/main/userStatistics',
            name: 'user_summary',
            meta: {
              crumbTitle: 'router.user_summary',
              meta: 'first_web_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_manage/userStatistics/userStatistics'
              )
          },
          // 小程序管理系列子路由
          // 页面分类
          {
            path: '/admin/home/main/page_classification',
            name: 'page_classification',
            meta: {
              crumbTitle: 'router.pageClassification',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/pageClassification/pageClassification'
              )
          },
          {
            path: '/admin/home/main/freight_template',
            name: 'image_list',
            meta: {
              crumbTitle: 'router.pictureSpace',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/PictureSpace/freight_template'
              )
          },
          {
            path: '/admin/home/main/video_space',
            name: 'video_list',
            meta: {
              crumbTitle: 'router.videoSpace',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/videoSpace/videoSpace'
              )
          },
          {
            path: '/admin/home/main/shopStyle',
            name: 'shop_style',
            meta: {
              crumbTitle: 'router.shopStyle',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/shopStyle/shopStyle'
              )
          },
          // 页面装修
          {
            path: '/admin/home/main/pictureSetting',
            name: 'picture_setting',
            meta: {
              crumbTitle: 'router.picture_setting',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/picture_setting/picture_setting'
              )
          },
          {
            path: '/admin/home/main/decorationHome',
            name: 'decorationHome',
            meta: {
              crumbTitle: 'router.picture_setting',
              meta: 'first_web_decoration',
              category: 'picture_setting'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/picture_setting/decorationHome'
              )
          },
          // 悬浮窗
          {
            path: '/admin/home/main/suspendWindow',
            name: 'suspendWindow',
            meta: {
              crumbTitle: 'router.suspendWindow',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/suspendWindow/suspendWindow'
              )
          },
          {
            path: '/admin/home/main/bottomNavigation',
            name: 'image_manager',
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/bottomNavigation/bottomNavigation'
              ),
            meta: {
              crumbTitle: 'router.bottomNavigation',
              meta: 'first_web_decoration'
            },
            // 选择链接弹窗子组件路由
            children: [
              // 常用链接
              {
                path: '/admin/home/main/bottomNavigation/commonLinks',
                name: 'commonLinks',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import('@/components/admin/selectLinksComponents/commonLinks')
              },
              // 商品链接
              {
                path: '/admin/home/main/bottomNavigation/commodityLinks',
                name: 'commodityLinks',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import(
                    '@/components/admin/selectLinksComponents/commodityLinks'
                  )
              },
              // 自定义页面
              {
                path: '/admin/home/main/bottomNavigation/customPage',
                name: 'customPage',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import('@/components/admin/selectLinksComponents/customPage')
              },
              // 营销活动
              {
                path: '/admin/home/main/bottomNavigation/groupDrawing',
                name: 'groupDrawing',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import(
                    '@/components/admin/selectLinksComponents/groupDrawing'
                  )
              },
              // 商品分类
              {
                path:
                  '/admin/home/main/bottomNavigation/classificationOfCommodities',
                name: 'classificationOfCommodities',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import(
                    '@/components/admin/selectLinksComponents/classificationOfCommodities'
                  )
              },
              // 网页跳转
              {
                path: '/admin/home/main/bottomNavigation/pageJump',
                name: 'pageJump',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import('@/components/admin/selectLinksComponents/pageJump')
              },
              // 小程序跳转
              {
                path: '/admin/home/main/bottomNavigation/smallProgramJump',
                name: 'smallProgramJump',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import(
                    '@/components/admin/selectLinksComponents/smallProgramJump'
                  )
              },
              // 表单页面&&门店
              {
                path: '/admin/home/main/bottomNavigation/formPage',
                name: 'formPage',
                meta: {
                  crumbTitle: 'router.bottomNavigation',
                  meta: 'first_web_decoration',
                  category: 'image_manager'
                },
                component: () =>
                  import('@/components/admin/selectLinksComponents/formPage')
              }
            ]
          },
          {
            path: '/admin/home/main/personalCenter',
            name: 'user_center_config',
            meta: {
              crumbTitle: 'router.personalCenter',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/personalCenter/personalCenter'
              )
          },
          // 搜索配置
          {
            path: '/admin/home/main/searchConfig',
            name: 'search_config',
            meta: {
              crumbTitle: 'router.searchConfig',
              meta: 'first_web_decoration'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/first_web_decoration/searchConfig/searchConfig'
              )
          },
          // 商品管理系列
          // 商品管理/全部商品
          {
            path: '/admin/home/main/goodsManage/allGoods',
            redirect: '/admin/home/main/goodsManage/goodsForSale',
            name: 'sale_on',
            meta: {
              crumbTitle: 'router.goodsForSale',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/allGoods/allGoods'
              ),
            children: [
              // 商品管理/出售中商品
              {
                path: '/admin/home/main/goodsManage/goodsForSale',
                name: 'goodsForSale',
                meta: {
                  crumbTitle: 'router.goodsForSale',
                  meta: 'goods_manage',
                  category: 'sale_on'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/allGoods/saleOn/allGoodsSaleOn'
                  )
              },
              // 商品管理/已售罄
              {
                path: '/admin/home/main/goodsManage/goodsForSaleOut',
                name: 'sale_out',
                meta: {
                  crumbTitle: 'router.goodsForSaleOut',
                  meta: 'goods_manage'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/allGoods/saleOff/allGoodsSaleOff'
                  )
              },
              // 商品管理/仓库中
              {
                path: '/admin/home/main/goodsManage/goodsForInStock',
                name: 'goodsForInStock',
                meta: {
                  crumbTitle: 'router.goodsForInStock',
                  meta: 'goods_manage',
                  category: 'sale_on'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/allGoods/inStock/allGoodsInStock'
                  )
              },
              // 商品管理/审核
              {
                path: '/admin/home/main/goodsManage/goodsForAudit',
                name: 'goodsForAudit',
                meta: {
                  crumbTitle: 'router.goodsForAudit',
                  meta: 'goods_manage',
                  category: 'sale_on'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/allGoods/audit/goodsForAudit'
                  )
              }
            ]
          },
          // 商品管理 添加商品
          {
            path: '/admin/home/main/goodsManage/addGoods',
            name: 'goods_add',
            meta: {
              crumbTitle: 'router.addGoods',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/addAndUpdateGoods/addAndUpdateGoods'
              )
          },
          // 商品管理 编辑商品
          {
            path: '/admin/home/main/goodsManage/updateGoods/:goodsId',
            name: 'goods_update',
            meta: {
              crumbTitle: 'router.updateGoods',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/addAndUpdateGoods/addAndUpdateGoods'
              )
          },
          // 商品管理/运费模板
          {
            path: '/admin/home/main/goodsManage/deliverTemplate',
            name: 'deliver',
            redirect: '/admin/home/main/goodsManage/deliverTemplate/list',
            meta: {
              crumbTitle: 'router.deliverTemplate',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/deliverTemplate/deliverTemplate'
              ),
            children: [
              // 商品管理/运费模板/运费模板列表
              {
                path: '/admin/home/main/goodsManage/deliverTemplate/list',
                name: 'deliverTemplateList',
                meta: {
                  crumbTitle: 'router.deliverTemplate',
                  meta: 'goods_manage',
                  category: 'deliver'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/deliverTemplate/deliverTemplateList'
                  )
              },
              // 商品管理/运费模板/重量运费模板列表
              {
                path: '/admin/home/main/goodsManage/deliverTemplate/weightList',
                name: 'deliverTemplateWeightList',
                meta: {
                  crumbTitle: 'router.deliverTemplate',
                  meta: 'goods_manage',
                  category: 'deliver'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/deliverTemplate/deliverTemplateWeightList'
                  )
              },
              // 商品管理/运费模板/添加运费模板
              {
                path:
                  '/admin/home/main/goodsManage/deliverTemplate/deliverTemplateAdd',
                name: 'deliverTemplateAdd',
                meta: {
                  crumbTitle: 'router.deliverTemplate',
                  meta: 'goods_manage',
                  category: 'deliver'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/deliverTemplate/deliverTemplateAdd'
                  )
              },
              // 商品管理/运费模板/添加重量运费模板
              {
                path:
                  '/admin/home/main/goodsManage/deliverTemplate/deliverTemplateWeightAdd',
                name: 'deliverTemplateWeightAdd',
                meta: {
                  crumbTitle: 'router.deliverTemplate',
                  meta: 'goods_manage',
                  category: 'deliver'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/deliverTemplate/deliverTemplateWeightAdd'
                  )
              },
              // 商品管理/运费模板/模板编辑
              {
                path:
                  '/admin/home/main/goodsManage/deliverTemplate/deliverTemplateUpdate',
                name: 'deliverTemplateUpdate',
                meta: {
                  crumbTitle: 'router.deliverTemplate',
                  meta: 'goods_manage',
                  category: 'deliver'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/deliverTemplate/deliverTemplateUpdate'
                  )
              }
            ]
          },
          // 商品管理/商家分类管理
          {
            path: '/admin/home/main/goodsManage/goodsSortManagement',
            redirect:
              '/admin/home/main/goodsManage/goodsSortManagement/allGoodsSort',
            name: 'sort',
            meta: {
              crumbTitle: 'router.goodsSortManagement',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/sortManagement'
              ),
            children: [
              //  商品管理/商家分类管理/分类列表
              {
                path:
                  '/admin/home/main/goodsManage/goodsSortManagement/allGoodsSort',
                name: 'allGoodsSort',
                meta: {
                  crumbTitle: 'router.goodsSortManagement',
                  meta: 'goods_manage',
                  category: 'sort'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/allGoodsSort'
                  )
              },
              {
                path:
                  '/admin/home/main/goodsManage/goodsSortManagement/allGoodsRecommendSort',
                name: 'allGoodsRecommendSort',
                meta: {
                  crumbTitle: 'router.goodsSortManagement',
                  meta: 'goods_manage',
                  category: 'sort'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/allGoodsRecommendSort'
                  )
              },
              {
                path:
                  '/admin/home/main/goodsManage/goodsSortManagement/addGoodsSort',
                name: 'addGoodsSort',
                meta: {
                  crumbTitle: 'router.goodsSortManagement',
                  meta: 'goods_manage',
                  category: 'sort'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/addAndUpdateGoodsSort'
                  )
              },
              {
                path:
                  '/admin/home/main/goodsManage/goodsSortManagement/updateGoodsSort/:sortId',
                name: 'updateGoodsSort',
                meta: {
                  crumbTitle: 'router.goodsSortManagement',
                  meta: 'goods_manage',
                  category: 'sort'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/addAndUpdateGoodsSort'
                  )
              },
              {
                path:
                  '/admin/home/main/goodsManage/goodsSortManagement/addGoodsRecommendSort',
                name: 'addGoodsRecommendSort',
                meta: {
                  crumbTitle: 'router.goodsSortManagement',
                  meta: 'goods_manage',
                  category: 'sort'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/addAndUpdateGoodsRecommendSort'
                  )
              },
              {
                path:
                  '/admin/home/main/goodsManage/goodsSortManagement/updateGoodsRecommendSort/:sortId',
                name: 'updateGoodsRecommendSort',
                meta: {
                  crumbTitle: 'router.goodsSortManagement',
                  meta: 'goods_manage',
                  category: 'sort'
                },
                component: () =>
                  import(
                    '@/view/admin/index/leftNavComponents/goods_manage/goodsSortManagement/addAndUpdateGoodsRecommendSort'
                  )
              }
            ]
          },
          // 商品管理/品牌管理
          {
            path: '/admin/home/main/goodsManage/brandManagement',
            name: 'brand',
            meta: {
              crumbTitle: 'router.brandManagement',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/brandManagement/brandManagement'
              )
          },
          // 商品管理/品牌管理/添加品牌
          {
            path: '/admin/home/main/goodsManage/addBrand',
            name: 'addBrand',
            meta: {
              crumbTitle: 'router.brandAddManagement',
              meta: 'goods_manage',
              category: 'brand'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/brandManagement/addBrand'
              )
          },
          // 商品管理/评价管理
          {
            path: '/admin/home/main/goodsManage/evaluationManagement',
            name: 'comment',
            meta: {
              crumbTitle: 'router.evaluationManagement',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/evaluationManagement/evaluationManagement'
              )
          },
          // 商品管理/商品推荐
          {
            path: '/admin/home/main/goodsManage/goodsRecommend',
            name: 'recommend',
            meta: {
              crumbTitle: 'router.goodsRecommend',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsRecommend/goodsRecommend'
              )
          },
          // 商品管理/商品推荐
          {
            path: '/admin/home/main/goodsManage/goodsRecommend/add',
            name: 'addRecommend',
            meta: {
              crumbTitle: 'router.addGoodsRecommend',
              meta: 'goods_manage',
              category: 'recommend'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsRecommend/addGoodsRecommend'
              )
          },

          // 商品管理/商品标签
          {
            path: '/admin/home/main/goodsManage/goodsLabel',
            name: 'label',
            meta: {
              crumbTitle: 'router.goodsLabel',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsLabel/allGoodsLabel'
              )
          },
          {
            path: '/admin/home/main/goodsManage/goodsLabel/addGoodsLabel',
            name: 'addGoodsLabel',
            meta: {
              crumbTitle: 'router.addGoodsLabel',
              meta: 'goods_manage',
              category: 'label'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsLabel/addAndUpdateGoodsLabel'
              )
          },
          {
            path:
              '/admin/home/main/goodsManage/goodsLabel/updateGoodsLabel/:id',
            name: 'updateGoodsLabel',
            meta: {
              crumbTitle: 'router.updateGoodsLabel',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsLabel/addAndUpdateGoodsLabel'
              )
          },
          // 商品管理/商品导入
          {
            path: '/admin/home/main/goodsManage/goodsImport',
            name: 'goods_import',
            meta: {
              crumbTitle: 'router.goodsImport',
              meta: 'goods_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/goods_manage/goodsImport/goodsImport'
              )
          },
          // 门店管理系列子路由
          {
            path: '/admin/home/main/store',
            name: 'store',
            meta: {
              crumbTitle: '',
              meta: 'store_manage'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/store_manage/store_manage'
              )
          },
          // 基础配置系列子路由
          {
            path: '/admin/home/main/base_manger/:isAuth',
            name: 'config_list',
            meta: {
              crumbTitle: 'router.base_manger',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/base_manger'
              )
          },
          // 基础配置 - 交易配置
          {
            path: '/admin/home/main/tradeConfigure',
            name: 'pay',
            meta: {
              crumbTitle: 'router.pay',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/tradeConfigure/tradeConfigure'
              )
          },
          // 基础配置 - 交易流程相关配置 - 编辑条款
          {
            path: '/admin/home/main/tradeConfigure/termsService',
            name: 'termsService',
            meta: {
              crumbTitle: 'router.termsService',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/tradeConfigure/termsService'
              )
          },
          // 基础配置/模板消息
          {
            path: '/admin/home/main/basicConfig/templateMessage',
            name: 'message_config',
            meta: {
              crumbTitle: 'router.templateMessage',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/templateMessage/templateMessage'
              )
          },
          // 基础配置/服务承诺
          {
            path: '/admin/home/main/basicConfig/servicePledge',
            name: 'pledge',
            meta: {
              crumbTitle: 'router.pledge',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/servicePledge/servicePledgeList'
              )
          },
          // 基础配置 - 店铺权限
          {
            path: '/admin/home/main/shopAuthority',
            name: 'child_config',
            meta: {
              crumbTitle: 'router.child_config',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/shopAuthority/shopAuthority'
              )
          },
          // 基础配置 - 操作记录
          {
            path: '/admin/home/main/actionRecord',
            name: 'action_record',
            meta: {
              crumbTitle: 'router.action_record',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/actionRecord/actionRecord'
              )
          },
          // 版本升级与续费
          {
            path: '/admin/home/main/versionUpgrade',
            name: 'version_upgrade',
            meta: {
              crumbTitle: '',
              meta: 'base_manager'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/version_upgrade'
              )
          },
          // 基础配置 第三方配置
          {
            path: '/admin/home/main/thirdConfig',
            name: 'third_auth',
            meta: {
              crumbTitle: 'router.third_auth',
              meta: 'base_manger',
              category: 'third_auth'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/thirdConfig/thirdPartyConfig'
              )
          },
          // 基础配置/短信配置
          {
            path: '/admin/home/main/basicConfig/smsConfig',
            name: 'smsConfig',
            meta: {
              crumbTitle: 'router.smsConfig',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/smsRecord/smsConfig'
              )
          },
          {
            path: '/admin/home/main/basicConfig/rebateConfig',
            name: 'rebateConfig',
            meta: {
              crumbTitle: 'router.rebateConfig',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/rebateConfig/rebateConfig'
              )
          },
          {
            path: '/admin/home/main/basicConfig/rebateConfig/doctorWithdrawInfo',
            name: 'doctorWithdrawInfo',
            meta: {
              crumbTitle: 'router.doctorWithdrawInfo',
              meta: 'base_manger'
            },
            component: () =>
              import(
                '@/view/admin/index/leftNavComponents/base_manger/rebateConfig/doctorWithdrawInfo'
              )
          }
        ].concat(
          marketing,
          member,
          order,
          store,
          doctorManger,
          prescriptionManger
        )
      }
    ]
  },
  {
    path: '/admin/selectlinks',
    name: 'selectLinks',
    component: () => import('@/components/admin/selectLinks')
  }
]
export default routes
