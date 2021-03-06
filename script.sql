USE [master]
GO
/****** Object:  Database [BanHang]    Script Date: 11/05/2018 20:10:40 ******/
CREATE DATABASE [BanHang] ON  PRIMARY 
( NAME = N'BanHang', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\BanHang.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'BanHang_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\BanHang_log.LDF' , SIZE = 768KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [BanHang] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [BanHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [BanHang] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [BanHang] SET ANSI_NULLS OFF
GO
ALTER DATABASE [BanHang] SET ANSI_PADDING OFF
GO
ALTER DATABASE [BanHang] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [BanHang] SET ARITHABORT OFF
GO
ALTER DATABASE [BanHang] SET AUTO_CLOSE ON
GO
ALTER DATABASE [BanHang] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [BanHang] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [BanHang] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [BanHang] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [BanHang] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [BanHang] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [BanHang] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [BanHang] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [BanHang] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [BanHang] SET  ENABLE_BROKER
GO
ALTER DATABASE [BanHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [BanHang] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [BanHang] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [BanHang] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [BanHang] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [BanHang] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [BanHang] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [BanHang] SET  READ_WRITE
GO
ALTER DATABASE [BanHang] SET RECOVERY SIMPLE
GO
ALTER DATABASE [BanHang] SET  MULTI_USER
GO
ALTER DATABASE [BanHang] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [BanHang] SET DB_CHAINING OFF
GO
USE [BanHang]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/05/2018 20:10:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[phone] [varchar](20) NULL,
	[username] [varchar](30) NULL,
	[password] [varchar](32) NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON
INSERT [dbo].[KhachHang] ([cid], [cname], [address], [phone], [username], [password], [status]) VALUES (1, N'Hai123', N'Hanoi', N'0988312832', N'haihn', N'hai123', 1)
INSERT [dbo].[KhachHang] ([cid], [cname], [address], [phone], [username], [password], [status]) VALUES (2, N'Luu Van Dat', N'Hanoi', N'012312938283', N'luudat123', N'123456', 1)
INSERT [dbo].[KhachHang] ([cid], [cname], [address], [phone], [username], [password], [status]) VALUES (3, N'Pham Duong', N'Quang Ninh', N'0123989384', N'duongpm', N'123456', 1)
INSERT [dbo].[KhachHang] ([cid], [cname], [address], [phone], [username], [password], [status]) VALUES (4, N'Anonymous', N'none', N'09209309232', N'abc123', N'123456', 0)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
/****** Object:  Table [dbo].[HangSanXuat]    Script Date: 11/05/2018 20:10:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HangSanXuat](
	[hid] [int] IDENTITY(1,1) NOT NULL,
	[hname] [nvarchar](30) NULL,
	[website] [varchar](100) NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[hid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[HangSanXuat] ON
INSERT [dbo].[HangSanXuat] ([hid], [hname], [website], [status]) VALUES (1, N'Apple', N'apple.com', 1)
INSERT [dbo].[HangSanXuat] ([hid], [hname], [website], [status]) VALUES (2, N'HP', N'hp.com', 1)
INSERT [dbo].[HangSanXuat] ([hid], [hname], [website], [status]) VALUES (3, N'Dell', N'dell.com', 1)
INSERT [dbo].[HangSanXuat] ([hid], [hname], [website], [status]) VALUES (4, N'Asus', N'asus.com', 1)
INSERT [dbo].[HangSanXuat] ([hid], [hname], [website], [status]) VALUES (5, N'Apple', N'apple.com', 0)
INSERT [dbo].[HangSanXuat] ([hid], [hname], [website], [status]) VALUES (11, N'datbeo', N'poipoipoipoi', 0)
SET IDENTITY_INSERT [dbo].[HangSanXuat] OFF
/****** Object:  Table [dbo].[admin]    Script Date: 11/05/2018 20:10:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[admin](
	[username] [varchar](30) NOT NULL,
	[password] [varchar](32) NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[admin] ([username], [password], [status]) VALUES (N'admin', N'admin', 1)
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/05/2018 20:10:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HoaDon](
	[hid] [varchar](32) NOT NULL,
	[date] [datetime] NULL,
	[cid] [int] NULL,
	[Rcname] [nvarchar](50) NULL,
	[Raddress] [nvarchar](50) NULL,
	[Rphone] [varchar](20) NULL,
	[total] [money] NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[hid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[HoaDon] ([hid], [date], [cid], [Rcname], [Raddress], [Rphone], [total], [status]) VALUES (N'0784480b2887422c92f42a164e1d65c0', CAST(0x0000A98E017BCC37 AS DateTime), 3, N'Pham Duong', N'Quang Ninh', N'02123123223', 100.0000, 1)
INSERT [dbo].[HoaDon] ([hid], [date], [cid], [Rcname], [Raddress], [Rphone], [total], [status]) VALUES (N'0e3a8c193e604abcba108810738234db', CAST(0x0000A98E017B17EB AS DateTime), 1, N'Hai', N'Quang Ninh', N'02123123223', 480.0000, 1)
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/05/2018 20:10:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SanPham](
	[sid] [varchar](32) NOT NULL,
	[sname] [nvarchar](50) NOT NULL,
	[quantity] [int] NULL,
	[price] [money] NULL,
	[picture] [varchar](200) NULL,
	[description] [nvarchar](max) NULL,
	[status] [int] NULL,
	[hid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[sid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[SanPham] ([sid], [sname], [quantity], [price], [picture], [description], [status], [hid]) VALUES (N'2f720716dcc54bebab4a4771f22bebb4', N'MacBook Pro 13', 10, 200.0000, N'https://cdn.fptshop.com.vn/Uploads/Originals/2018/9/4/636716712475449777_macbook-pro-13-touch-bar-256gb-2018-xam-3.jpg', N'abc', 1, 1)
INSERT [dbo].[SanPham] ([sid], [sname], [quantity], [price], [picture], [description], [status], [hid]) VALUES (N'3a165094c7ec47dda0a620d8d2fc4ef6', N'Dell Inspiron N3576', 70, 240.0000, N'https://cdn.fptshop.com.vn/Uploads/Originals/2018/5/22/636625859225921010_N3576-1.png', N'abc', 1, 3)
INSERT [dbo].[SanPham] ([sid], [sname], [quantity], [price], [picture], [description], [status], [hid]) VALUES (N'3af30b666064401b83c3cc30d41f88b4', N'Asus A540LA-XX289T', 5, 100.0000, N'http://sieuthidienmayhb.com.vn/wp-content/uploads/2017/03/asus-a540la-xx289t-den9-800x800.jpg', N'bca', 1, 4)
INSERT [dbo].[SanPham] ([sid], [sname], [quantity], [price], [picture], [description], [status], [hid]) VALUES (N'62af45f837d949ebabf4fa022edd58b9', N'MacBook Pro ', 123, 100.0000, N'https://www.longhornmacrepair.com/wp-content/uploads/2017/10/MBP-13G-MAV-2.jpg', N'abc', 1, 1)
INSERT [dbo].[SanPham] ([sid], [sname], [quantity], [price], [picture], [description], [status], [hid]) VALUES (N'6610e126e98249808a8f018aa7ffd281', N'MacBook Air 13', 123, 100.0000, N'https://cdn.fptshop.com.vn/Uploads/Originals/2017/6/12/636328793662686875_airMMGF2ZP-1.jpg', N'abc', 1, 1)
INSERT [dbo].[SanPham] ([sid], [sname], [quantity], [price], [picture], [description], [status], [hid]) VALUES (N'a7dec0dfc427422c899bf5736a191a28', N'HP 15-bs666TX', 150, 150.0000, N'https://cdn.fptshop.com.vn/Uploads/Originals/2017/12/15/636489258208654486_636378032370096976_HP-15-bs637TX-1.png', N'abc', 1, 2)
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 11/05/2018 20:10:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[hid] [varchar](32) NOT NULL,
	[sid] [varchar](32) NOT NULL,
	[quantity] [int] NULL,
	[price] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[hid] ASC,
	[sid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF__KhachHang__statu__1367E606]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT ((1)) FOR [status]
GO
/****** Object:  Default [DF__HangSanXu__statu__060DEAE8]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[HangSanXuat] ADD  DEFAULT ((1)) FOR [status]
GO
/****** Object:  Default [DF__admin__status__014935CB]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[admin] ADD  DEFAULT ((1)) FOR [status]
GO
/****** Object:  Default [DF__HoaDon__date__182C9B23]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (getdate()) FOR [date]
GO
/****** Object:  Default [DF__HoaDon__status__1A14E395]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT ((1)) FOR [status]
GO
/****** Object:  Default [DF__SanPham__status__0AD2A005]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((1)) FOR [status]
GO
/****** Object:  ForeignKey [FK__HoaDon__cid__1920BF5C]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([cid])
REFERENCES [dbo].[KhachHang] ([cid])
GO
/****** Object:  ForeignKey [FK__SanPham__hid__0BC6C43E]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([hid])
REFERENCES [dbo].[HangSanXuat] ([hid])
GO
/****** Object:  ForeignKey [FK__HoaDonChiTi__hid__1ED998B2]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([hid])
REFERENCES [dbo].[HoaDon] ([hid])
GO
/****** Object:  ForeignKey [FK__HoaDonChiTi__sid__1FCDBCEB]    Script Date: 11/05/2018 20:10:40 ******/
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([sid])
REFERENCES [dbo].[SanPham] ([sid])
GO
