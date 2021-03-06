// 用于商品的新增，修改，详情页的国际化
// 英文
export const en = {
  toggleName: 'Collapse more setting',
  linkDetail: 'Check details',
  linkRefresh: 'Refresh',
  editGoodsBasicInfo: 'Edit goods basic info',
  editGoodsDetailInfo: 'Edit goods detail info',
  editGoodsDistributionInfo: 'Edit goods distribution info',
  saveAndReturnList: 'Save and return to list',
  previewStep: 'Preview step',
  nextStep: 'Next step',
  saveAndAdd: 'Save and add',
  saveAndReview: 'Save and review',
  continueAdd: 'Continue add',
  returnToList: 'Return list',
  filter: 'Filter',
  createTime: 'Create time',
  alreadySelected: 'Already selected：',
  confirmBtn: 'Confirm',
  cancelBtn: 'Cancel',
  goodsInfoMissing: 'goods info missing',
  goodsWeightConfigInfo: ' The deliver template already selected is \'Weight Type\'，for saving must has goods weight value.If there is no goods weight input，Please go "Basic Config-Shop Basic Config-Shop Normal Config"，and then enable"Goods Weight Config" setting,for reediting goods info。Click OK button can enable the setting auto',
  warningInfo: {
    requireGoodsName: 'Require goods name',
    requirePlatformClassify: 'Require platform classify',
    requireGoodsImage: 'Require goods image',
    requireGoodsUnit: 'Require goods unit',
    requireGoodsNumber: 'Require goods number',
    requireGoodsPrice: 'Require goods price',
    requireGoodsCostPrice: 'Require goods cost price',
    serverWrong: 'server error:',
    pleaseConnectUs: ',please connect us',
    goodsNameRepeat: 'goods name repeat',
    goodsSnRepeat: 'goods sn repeat',
    goodsSpecNameRepeat: 'goods spec name repeat',
    goodsSpecValKRepeat: 'goods spec val name repeat',
    goodsSkuSnRepeat: 'sku sn repeat',
    gradPrdPriceIsNull: 'grad prd price can not be null',
    gradePrdPriceHigherThanGoodsPrice:
      'grade prd price is higher than goods price',
    goodsPriceIsNull: 'goods price can not be null',
    prdPriceIsNull: 'prd price can not be null',
    goodsPrdSnRepeat: 'goods prd sn repeat',
    goodsSpec: 'Spec: ',
    priceIsWrong: ' price is wrong',
    goodsNumIsWrong: ' goods number is wrong',
    goodsWeightIsNull: 'goods weight is null',
    goodsPrdWeightIsNull: 'goods prd weight is null',
    goodsPrdCodesInnerRepeated: 'goods prd codes inner repeated',
    goodsPrdCodesExist: 'goods prd codes exist',
    goodsNumberWrong: 'goods number is wrong',
    goodsPriceWrong: 'goods price is wrong',
    costPriceWrong: 'cost price is wrong',
    memberPriceIsNull: 'member price is null',
    memberPriceIsLarger: 'member price is lager than goods price',
    limitPriceIsWrong: 'limit price is larger than max price'
  },
  basicInfo: {
    title: 'basicinfo',
    goodsName: 'Goods name：',
    goodsAd: 'Goods advertisement：',
    goodsSn: 'Goods sn：',
    goodsSnTip:
      'If not filled in, the system will automatically generate the article number',
    catId: 'Platform classification：',
    catIdTip:
      "“Platform classification”is goods's attributes in system，won't show for user.can be setted in “Basic Setting”for default setting。",
    catIdWarning: 'Choose Platform classification',
    catIdSelectDefault: 'Choose Platform classification',
    catIdGo: 'go',
    goodsImg: 'Goods main picture：',
    goodsImgTip: 'Advise Size：800*800px'
  },
  basicInfoOther: {
    unit: 'Unit：',
    unitOptions: [
      'individual',
      'package',
      'box',
      'bug',
      'stock',
      'luggage',
      'roll',
      'sheet',
      'stage',
      'ton',
      'square meter',
      'capital',
      'paire',
      'pice',
      'branch',
      'case',
      'part',
      'rm',
      'kg',
      'custom'
    ],
    unitTip: 'The length limit is 3 words',
    sortId: 'Merchant classification：',
    sortIdDefault: 'Choose Merchant classification',
    alreadySelected: 'Point Label: ',
    normalLabel: 'Normal Label: ',
    goodsLabel: 'Goods label：',
    goodsLabelDefault: 'Choose goods label',
    goodsLabelNew: 'Create label',
    goodsLabelManage: 'Management label',
    goodsBrand: 'Goods Brand：',
    goodsBrandAdd: 'Add Brand',
    goodsBrandNew: 'Create Brand',
    goodsBrandManage: 'Management Goods Brand',
    goodsBrandTitle: 'Add goods Brand',
    goodsBrandName: 'Brand name',
    goodsBrandClassify: 'Brand classification',
    goodsBrandClassifyDefault: 'Choose',
    goodsVideo: 'Goods video',
    goodsVideoTip:
      'Uploading video only supports MP4 format.In order to ensure normal playback in various network environments at the wireless terminal, only video with upload size no more than 10M and duration no more than 3 minutes is supported'
  },
  stockAndPriceInfo: {
    title: 'Stock/Price Info',
    goodsPrd: 'Goods SKU：',
    goodsPrdAdd: 'Add goods SKU',
    goodsSpecName: 'SKU name',
    goodsSpecVal: 'SKU value',
    goodsSpecValAdd: 'Add SKU value',
    goodsSpecAdd: 'Add SKU',
    goodsSpecPrice: 'SKU Price：',
    goodsSpecShopPrice: 'Price(dollars)',
    goodsSpecShopCost: 'Cost price(dollars)',
    goodsSpecPrdWeight: 'Weight',
    goodsSpecMarketPrice: 'Market price(dollars)',
    goodsSpecGoodsNum: 'Stock',
    goodsSpecGoodsPrdSn: 'SKU SN',
    goodsSpecGoodsPrdCodes: 'Prd Codes',
    goodsSpecGoodsImg: 'SKU Picture',
    batchUpdate: 'Batch Setting',
    batchPrice: 'Price',
    batchCost: 'Cost price',
    batchMarketPrice: 'Market Price',
    batchNum: 'Stock',
    batchWeight: 'Prd Weight',
    batchImgSrc: 'SKU Picture',
    goodsNumber: 'Goods Stock：',
    goodsNumberTip:
      'Set up the specification of inventory goods inventory will be invalid, not front - end display',
    goodsShopPrice: 'Goods price：',
    goodsMarketPrice: 'Market price：',
    goodsShopPriceTip:
      'Set up the specification of inventory goods shop price will be invalid, not front - end display',
    goodsGradeMember: 'Membership price：',
    goodsGradeMemberTip:
      'Membership price is only set for grade membership card, non-grade membership card can not set membership price.If the grade membership card also contains member discount, then member price and member discount can be enjoyed at the same time',
    goodsSpecPrdPrice: 'Goods sku price',
    unifyMemberCardsPrice: 'Unify member card price',
    prdPrice: 'Prd price($)',
    goodsPrice: 'Goods price($)',
    unifyMemberPrice: 'Unify Member Price'
  },
  stockAndPriceInfoOther: {
    limitBuyNum: 'Minimum purchase quantity：',
    limitBuyNumTip: '0 or no indicates no limit on purchase quantity',
    maxBuyNum: 'Maximum purchase quantity：',
    maxBuyNumTip: '0 or no indicates no limit on purchase quantity',
    costPrice: 'Cost price：',
    costPriceTip:
      'Set up the specification of cost price the price will be invalid, not front - end display',
    baseSale: 'Initial sales：',
    baseSaleSetting:
      'After setting, the sales volume seen by your user = initial sales volume + order quantity, the initial sales volume is not counted into the statistics.',
    goodsPrdSn: 'Goods SKU SN：',
    prdCodes: 'Prd Codes：'
  },
  deliverAndOtherInfo: {
    title: 'Deliver info',
    deliverTemplate: 'Deliver template：',
    deliverTemplateRefresh: 'Refresh template',
    deliverTemplateNew: 'Create deliver template',
    deliverTemplateManage: 'Manage deliver template',
    pintAreaOtherDeliverFee: 'Area other deliver fee：',
    pointAreaForFreeDeliverTemplate: 'Point area for free deliver template：',
    pointConditionForFreeDeliverTemplate:
      'Point condition for free deliver template：',
    deliverTemplateDefault: 'Shop default deliver template ',
    deliverTemplateUnit1: ' piece ',
    deliverTemplateUnit2: ' kg ',
    deliverTemplateTitleDesc1:
      ' Not available except in the distribution area ',
    deliverTemplateTitleDesc2: ' inner ',
    deliverTemplateTitleDesc3: ' dollar,peer add ',
    deliverTemplateTitleDesc4: ',add ',
    deliverTemplateTitleDesc5: ' order satisfy ',
    deliverTemplateTitleDesc6: ' free deliver，or the money is ',
    deliverTemplateTitleDesc7: ' dollar ',
    deliverTemplateTitleDesc8: ' Unified the fee：',
    deliverTemplateTitleDesc9: ' dollar ',
    deliverTemplateAreasDesc1: ' inner ',
    deliverTemplateAreasDesc2: ' dollar,peer add ',
    deliverTemplateAreasDesc3: ',add ',
    deliverTemplateAreasDesc4: ' dollar ',
    freeDeliverTemplateAreasDesc1: ' inner deliver for free ',
    freeDeliverTemplateAreasDesc2: 'satisfy ',
    freeDeliverTemplateAreasDesc3: ' dollar deliver for free ',
    freeDeliverTemplateAreasDesc4: ' inner，',
    freeDeliverTemplateAreasDesc5: ' dollar deliver for free ',
    goodsWeight: 'Goods weight：',
    deliverPlace: 'Ship address：',
    deliverPlaceTip: 'Max for 15 words',
    otherTitle: 'Other info',
    memberCard: 'membership exclusive card：',
    memberCardTip: 'Only user has this card can buy',
    chooseMemberCard: 'Choose member card',
    memberCardNew: 'Create member card',
    memberCardManage: 'Manage member card',
    memberCardSelected: 'Selected：',
    saleType: 'Sale time',
    saleNow: 'Sale right now',
    saleOnTime: 'Custom sale time',
    saleTimeNotNll: 'sale Time can not be null',
    saleTimeCanNotBeBefore: 'sale Time can not be before now',
    notSale: 'Not sale',
    chooseSaleTime: 'Choose sale time'
  },
  goodsDetail: {
    goodsDetailTitle: 'Goods info',
    priceIcon: '$',
    phoneNum: 'Stock',
    phoneGoodsDesc: 'Goods Desc',
    phoneGoodsDescTip1: 'Can edit the product details on the right',
    phoneGoodsDescTip2:
      'When no content is added, the content of this module is not displayed',
    phoneGoodsTempTip1: 'Customize the content area',
    phoneGoodsTempTip2: 'Can select the product page template on the right',
    phoneGoodsTempTip3:
      'When no content is added, the content of this module is not displayed',
    phoneGoodsTempTip4: 'Selected template:',
    goodsItemTitle: 'Goods basic info',
    goodsItemStyleTip:
      'Product information is a fixed style for reference only, please refer to the actual effect',
    goodsItemPositionTitle: 'Module position',
    goodsItemPositionRadio1: 'Custom content is on top',
    goodsItemPositionRadio2: 'Goods detail info is on top',
    goodsItemDecorateTitle: 'Custom content',
    goodsItemDecorateTitle2: 'Goods page template',
    goodsItemDecorateBtn: 'Select template',
    goodsItemDecorateAdd: 'Add template',
    goodsItemDecoratePageName: 'Page name',
    goodsItemDecoratePageClassification: 'Page classification',
    goodsItemDecoratePageSelector: 'Enter page name',
    goodsItemDecoratePageSearch: 'Search',
    goodsItemDecoratePageCreateTime: 'Create time',
    goodsItemDecoratePageIsDefaultPage: 'Is first page',
    goodsItemDecoratePageIsDefaultYes: 'Yes',
    goodsItemDecoratePageIsDefaultNo: 'No'
  },
  goodsDistribution: {
    distributionTitle: 'Distribution change price:',
    distributionTitleTip:
      'Allows the distributor to modify the price of a product while distributing it',
    goodsPrice: 'Goods price(dollar)',
    advicePrice: 'Advise price(dollar)',
    minPrice: 'Minimum price(dollar)',
    maxPrice: 'Maximum price(dollar)',
    promotionTitle: 'Distribution promotion language：',
    promotionTitleTip:
      'The distributor will copy this message directly to the mobile clipboard when downloading the current product poster',
    promotionSwitchOn: 'ON',
    promotionSwitchOff: 'OFF',
    promotionLanguage: 'PromotionLanguage：',
    promotionLanguageTooLong: 'Promotion language too long',
    promotionDocTooLong: 'Promotion doc too long',
    promotionDocIsNull: 'promotion doc is null',
    shareGoodsAction: 'Goods share poster：',
    shareGoodsActionRadio1: 'Default style',
    shareGoodsActionRadio2: 'Customer style',
    shareGoodsImgLinkLook: 'Look example',
    shareGoodsImgLinkDownload: 'Download poster',
    shareGoodsDoc: 'Document：',
    shareGoodsDocTip: 'Please enter no more than 15 words',
    shareGoodsImg: 'Share poster',
    shareGoodsImgRadio1: 'Goods main picture',
    shareGoodsImgRadio2: 'Customer picture',
    goodsLive: 'Goods Live:',
    goodsLiveTipInfo: 'Live info will be posted on goods detail info page after adding it',
    selectLiveRoomInfo: 'Select Living Room',
    addLiveRoomInfo: 'add living room',
    liveRoomName: 'Living Name',
    liveStatus: 'Living Status',
    onLiving: 'on living',
    liveNotStart: 'not start',
    liveEnd: 'end',
    livePausing: 'pausing',
    liveStartTime: 'Living start time',
    liveEndTime: 'Living end time',
    selectLiveInfoWarning: 'Please select live info'
  }
}
