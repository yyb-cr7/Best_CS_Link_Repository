# 导入模块
import requests
import random
from bs4 import BeautifulSoup

data=[]

user_agents = ['Mozilla/5.0 (Windows NT 6.1; rv:2.0.1) Gecko/20100101 Firefox/4.0.1','Mozilla/5.0 (Windows; U; Windows NT 6.1; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50','Opera/9.80 (Windows NT 6.1; U; en) Presto/2.8.131 Version/11.11']
def getOnePage(url):
    "得到一页信息"
    headers = {'User-Agent': random.choice(user_agents)}
    resp = requests.get(url, timeout=30,headers=headers)
    return resp.text

# 导入模块
import requests
import random
data=[]

user_agents = ['Mozilla/5.0 (Windows NT 6.1; rv:2.0.1) Gecko/20100101 Firefox/4.0.1','Mozilla/5.0 (Windows; U; Windows NT 6.1; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50','Opera/9.80 (Windows NT 6.1; U; en) Presto/2.8.131 Version/11.11']

def getOnePage(url):
    "得到一页信息"
    headers = {'User-Agent': random.choice(user_agents)}
    resp = requests.get(url, timeout=30,headers=headers)
    return resp.text

def main():
    f=open("CSDN.txt","wb",)
    url ="https://dengbocong.blog.csdn.net/article/details/104383089"
    text = getOnePage(url)
    soup=BeautifulSoup(text)
    titleNode = soup.find('div', id='content_views')
    #获取上面指定标签的文字
    title = titleNode.find_all("p")
    p = title[1].find_all("a")
    for i in p:
        print(i)
        f.write(bytes(i["href"], encoding = "utf8"))
        f.write(bytes(' ', encoding = "utf8"))

        f.write(bytes(i.string, encoding = "utf8"))
        f.write(bytes('\n', encoding = "utf8"))
    f.close()
main()
