# -*- coding: utf-8 -*-

import thriftpy

from thriftpy.rpc import client_context

hanlprpc_thrift = thriftpy.load(r"D:\workspace\HanLPRPC\thrift-files\hanlprpc.thrift",
                                module_name="hanlprpc_thrift")


def main():
    with client_context(hanlprpc_thrift.Segmenter,
                        '127.0.0.1', 6681) as client:

        result = client.seg("中华人民共和国成立五十周年")
        print(result)

if __name__ == '__main__':
    main()
