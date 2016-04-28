namespace java com.thriftrpc.hanlprpc
#@namespace scala com.thriftrpc.hanlprpc
namespace py hanlprpc

service Segmenter {
    list<string> seg(1: string text),
}