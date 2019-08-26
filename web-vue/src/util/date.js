import moment from 'moment'

export const format = s => moment(s).format('YYYY-MM-DD HH:mm:ss')

export const range = range => ({
  v1: range[0],
  v2: range[1]
})
